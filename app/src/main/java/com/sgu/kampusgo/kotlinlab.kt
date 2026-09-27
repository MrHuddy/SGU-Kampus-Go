package com.sgu.kampusgo

/**
 * Native Mobile Development — Lab 2
 * Replace every TODO(). Do not use !!.
 *
 * Run this as a small JVM main from Android Studio
 * (a plain Kotlin file with a main, or a unit-test-style runner).
 */

data class Student(
    val name: String,
    val npm: String,
    val angkatan: Int,
    val gpa: Double,
    val advisor: String?,
)

val sampleStudents: List<Student> = listOf(
    Student("Budi Santoso", "001", 2024, 3.81, "Ibu Wati"),
    Student("Siti Rahma", "002", 2024, 3.20, "Ibu Wati"),
    Student("Andi Wijaya", "003", 2023, 2.70, null),
    Student("Dewi Lestari", "004", 2025, 3.95, "Pak Eko"),
    Student("Raka Putra", "005", 2023, 3.55, "Pak Eko"),
    Student("Maya Chen", "006", 2025, 3.40, null),
    Student("Fajar Nugroho", "007", 2024, 3.62, "Ibu Wati"),
)

/** Students with GPA >= 3.5, sorted by GPA descending. */
fun deanList(students: List<Student>): List<Student> {
    //TODO("filter + sortedByDescending")
    return students
        .filter { it.gpa >= 3.5 }
        .sortedByDescending { it.gpa }
}

/** Average GPA. Empty list returns 0.0. Do not crash. */
fun averageGpa(students: List<Student>): Double {
    //TODO("ifEmpty + average")
    return students
        .map { it.gpa }
        .ifEmpty { return 0.0 }
        .average()
}

/** Map angkatan -> names in that cohort. */
fun namesByAngkatan(students: List<Student>): Map<Int, List<String>> {
    //TODO("groupBy + map values")
    return students
        .groupBy { it.angkatan }
        .mapValues { entry -> entry.value.map {it.name}}
}

/** NPMs that have no advisor. */
fun missingAdvisorNpms(students: List<Student>): List<String> {
    //TODO("filter advisor == null, map npm")
    return students
        .filter { it.advisor == null }
        .map {it.npm}
}

/**
 * Letter from GPA:
 * 3.5+ A, 3.0+ B, 2.0+ C, else D.
 */
fun letterGrade(gpa: Double): Char {
    //TODO("when")
    return when{
        gpa >= 3.5 -> 'A'
        gpa >= 3.0 -> 'B'
        gpa >= 2.0 -> 'C'
        else -> 'D'
    }

}

fun main() {
    checkEqual("deanList size", 4, deanList(sampleStudents).size)
    checkEqual("deanList first", "Dewi Lestari", deanList(sampleStudents).first().name)
    checkEqual("average roughly 3.46", 3, averageGpa(sampleStudents).toInt())
    checkEqual("angkatan keys", setOf(2023, 2024, 2025), namesByAngkatan(sampleStudents).keys)
    checkEqual("missing advisors", listOf("003", "006"), missingAdvisorNpms(sampleStudents))
    checkEqual("letter 3.81", 'A', letterGrade(3.81))
    checkEqual("letter 2.70", 'C', letterGrade(2.70))
    println("If you can read this, the checks above passed.")
}

private fun checkEqual(label: String, expected: Any?, actual: Any?) {
    if (expected != actual) {
        error("FAIL $label\n  expected: $expected\n  actual:   $actual")
    }
    println("OK  $label")
}
