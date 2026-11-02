# UML Class Diagram P14

Diagram ini mempertahankan seluruh operasi yang telah ada di source dan
melengkapi operasi serta pewarisan sesuai screenshot tugas.

```mermaid
classDiagram
    class Fans {
        -String name
        +Fans()
        +Fans(String name)
        +showName() void
        +watchingPerformances() void
        +watchingPerformances(Musician musician) void
        +watchingPerformance() void
        +watchingPerformance(Musician musician) void
        +watchingPerformance(Singer singer) void
        +watchingPerformance(Biduan biduan) void
    }

    class KpopFans {
        +KpopFans()
        +KpopFans(String name)
        +watchingPerformances(Musician musician, String expression) void
        +watchingPerformance(Kpop kpop, String keadaan) void
    }

    class Musician {
        +perform() void
    }

    class Singer {
        +perform() void
    }

    class Kpop {
        +perform() void
    }

    class Biduan {
        +perform() void
    }

    Fans <|-- KpopFans
    Musician <|-- Singer
    Singer <|-- Kpop
    Singer <|-- Biduan
    Fans ..> Musician : menonton perform
    KpopFans ..> Musician : menonton dengan ekspresi
```

`watchingPerformance` (tunggal) tetap dipertahankan karena dipanggil oleh
`Test.java`; method `watchingPerformances` (jamak) melengkapi signature pada
UML soal. `Test.java` tidak diubah.
