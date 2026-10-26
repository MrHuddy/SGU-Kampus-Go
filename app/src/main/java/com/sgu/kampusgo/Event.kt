// guided by Android Basics codelab: Add a scrollable list.
package com.sgu.kampusgo
data class Event(
    val id: String,
    val title: String,
    val category: String,
    val venue: String,
    val startsAt: String,
    val description: String,
)
val sampleEvents = listOf(
    Event(
        id = "evt-01",
        title = "NMD Guest Lecture:\n" +
                "Shipping on Play",
        category = "Academic",
        venue = "The Gade Campus,\n" +
                "Room 5.03",
        startsAt = "The Gade Campus,\n" +
                "Room 5.03",
        description = "A Play Console\n" +
                "walkthrough from a\n" +
                "former student. Bring\n" +
                "a laptop if you want\n" +
                "to follow the signing\n" +
                "step. This description\n" +
                "is intentionally long\n" +
                "so your detail screen\n" +
                "must scroll instead of\n" +
                "clipping the last\n" +
                "sentence off the\n" +
                "bottom of a phone.",
    ),
    Event(
        id = "evt-02",
        title = "UKM Programming:\n" +
                "Hack night",
        category = "UKM",
        venue = "Lab C",
        startsAt = "2026-09-\n" +
                "18T18:30:00+07:00",
        description = "Bring a charger.\n" +
                "Snacks from Kantin\n" +
                "Lt. 1.",
    ),

    Event(
        id = "evt-03",
        title = "OSIS Town Hall",
        category = "Student org",
        venue = "Auditorium",
        startsAt = "2026-09-\n" +
                "21T16:00:00+07:00",
        description = "Open mic for lab-fee\n" +
                "and parking\n" +
                "questions.",
    ),

    Event(
        id = "evt-04",
        title = "Canteen promo: Nasi\n" +
                "goreng Thursday",
        category = "Campus life",
        venue = "Kantin Lt. 1",
        startsAt = "2026-09-\n" +
                "17T11:00:00+07:00",
        description = "Until supplies last.",
    ),

    Event(
        id = "evt-05",
        title = "Career: internships at\n" +
                "local startups",
        category = "Career",
        venue = "Hall B",
        startsAt = "2026-09-\n" +
                "25T10:00:00+07:00",
        description = "CV clinic first 30\n" +
                "minutes.",
    ),

    Event(
        id = "evt-06",
        title = "Futsal: FIT vs Business",
        category = "Sports",
        venue = "Lapangan BSD",
        startsAt = "2026-09-\n" +
                "20T08:00:00+07:00",
        description = "Meet at lobby 07:15.",
    ),

    Event(
        id = "evt-07",
        title = "Library research\n" +
                "workshop",
        category = "Academic",
        venue = "Library training room",
        startsAt = "2026-09-\n" +
                "23T14:00:00+07:00",
        description = "IEEE and ACM login,\n" +
                "once.",
    ),

    Event(
        id = "evt-08",
        title = "Past: Orientation\n" +
                "recap screening",
        category = "Campus life",
        venue = "Student lounge",
        startsAt = "2026-08-\n" +
                "20T15:00:00+07:00",
        description = "This event is in the\n" +
                "past on purpose.\n" +
                "Your list should still\n" +
                "show it.",
    ),
)
