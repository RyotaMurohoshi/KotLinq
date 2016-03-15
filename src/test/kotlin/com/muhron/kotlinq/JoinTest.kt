package com.muhron.kotlinq

import org.junit.Assert
import org.junit.Test

class JoinTest {

    @Test
    fun testUnitsJoinPersons() {
        val actual: List<PersonViewModel> = units.join(
                persons.asSequence(),
                { unit -> unit.id },
                { person -> person.unitsId },
                { unit: Units, person: Person -> PersonViewModel(person.name, unit.name) }
        ).toList()

        val expected = listOf(
                PersonViewModel("Honoka", "Printemps"),
                PersonViewModel("Kotori", "Printemps"),
                PersonViewModel("Hanayo", "Printemps"),
                PersonViewModel("Umi", "lily white"),
                PersonViewModel("Rin", "lily white"),
                PersonViewModel("Nozomi", "lily white"),
                PersonViewModel("Eli", "BiBi"),
                PersonViewModel("Maki", "BiBi"),
                PersonViewModel("Niko", "BiBi")
        )

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testPersonsJoinUnits() {
        val actual: List<PersonViewModel> = persons.join(
                units.asSequence(),
                { person -> person.unitsId },
                { unit -> unit.id },
                { person: Person, unit: Units -> PersonViewModel(person.name, unit.name) }
        ).toList()

        val expected = listOf(
                PersonViewModel("Honoka", "Printemps"),
                PersonViewModel("Eli", "BiBi"),
                PersonViewModel("Kotori", "Printemps"),
                PersonViewModel("Umi", "lily white"),
                PersonViewModel("Rin", "lily white"),
                PersonViewModel("Maki", "BiBi"),
                PersonViewModel("Nozomi", "lily white"),
                PersonViewModel("Hanayo", "Printemps"),
                PersonViewModel("Niko", "BiBi")
        )

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun notIterateOuter() {
        val outer = exceptionSequence()
        val inner = sequenceOf(1, 2, 3, 4, 5)

        // no exception.
        outer.join(inner, { it }, { it }, { outer, inner -> outer * inner })
    }

    @Test(expected = Exception::class)
    fun notIterateOuterCatchException() {
        val outer = exceptionSequence()
        val inner = sequenceOf(1, 2, 3, 4, 5)

        // throw exception with iterate.
        for (num in outer.join(inner, { it }, { it }, { outer, inner -> outer * inner })) {
        }
    }

    @Test
    fun notIterateInner() {
        val outer = sequenceOf(1, 2, 3, 4, 5)
        val inner = exceptionSequence()

        // no exception.
        outer.join(inner, { it }, { it }, { outer, inner -> outer * inner })
    }

    @Test(expected = Exception::class)
    fun notIterateInnerCatchException() {
        val outer = sequenceOf(1, 2, 3, 4, 5)
        val inner = exceptionSequence()

        // throw exception with iterate.
        for (num in outer.join(inner, { it }, { it }, { outer, inner -> outer * inner })) {
        }
    }

    fun exceptionSequence(): Sequence<Int> = Sequence {
        throw Exception()
    }
}
