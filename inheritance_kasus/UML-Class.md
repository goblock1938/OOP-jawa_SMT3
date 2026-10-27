# UML Class

```mermaid
classDiagram
    direction TB

    class User {
        ~String nama
        ~String email
        ~String status
        ~User(nama: String, email: String)
        ~tampilkanIdentitas() void
        ~tampilkanPeran() void
    }

    class Mahasiswa {
        ~String nama
        ~String nrp
        ~String programStudi
        ~Mahasiswa(nama: String, email: String, nrp: String, programStudi: String)
        ~tampilkanPeran() void
        ~tampilkanDataAkademik() void
    }

    class MahasiswaSDT {
        ~String konsentrasi
        ~int semester
        ~MahasiswaSDT(nama: String, email: String, nrp: String, programStudi: String, konsentrasi: String, semester: int)
        ~tampilkanPeran() void
        ~tampilkanDetailSDT() void
    }

    class Main {
        +main(args: String[]) void
    }

    User <|-- Mahasiswa
    Mahasiswa <|-- MahasiswaSDT
    Main ..> MahasiswaSDT : membuat dan memanggil
```

`~` menandakan akses package-private; `+` menandakan public. `main` bersifat static.

**Catatan:** `Mahasiswa` mendeklarasikan `nama` sendiri, sehingga field ini berbeda dan menyembunyikan `User.nama`.
