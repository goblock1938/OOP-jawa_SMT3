# 🚀 Java Semester 3: Object-Oriented Programming (OOP)

Selamat datang di repositori **Java_SMT3**!
Repositori ini berisi kumpulan tugas, catatan pembelajaran, dan berbagai kode eksperimen menggunakan bahasa pemrograman **Java** selama Semester 3. Fokus utama dari repositori ini adalah penerapan paradigma **Object-Oriented Programming (OOP)**.

---

## 📚 Materi yang Dipelajari & Dieksplorasi

Di dalam repositori ini, saya mempraktikkan berbagai konsep inti OOP di Java, antara lain:

- **Konsep Dasar OOP**: Pembuatan _Class_, _Object_, _Method_, dan _Constructor_.
- **Encapsulation (Enkapsulasi)**: Penggunaan _access modifiers_ (`public`, `private`, `protected`) serta _Getter_ & _Setter_.
- **Inheritance (Pewarisan)**: Bagaimana sebuah _child class_ mewarisi sifat dari _parent class_ menggunakan kata kunci `extends`.
- **Polymorphism (Polimorfisme)**: Implementasi _Method Overloading_ dan _Method Overriding_ (`@Override`).
- **Abstraction (Abstraksi)**: Penggunaan `abstract class` dan `interface`.
- **Eksperimen & Percobaan Bebas**: Kumpulan kode uji coba (seperti `Main.java` / `Coba.java`) untuk menguji logika atau fitur baru Java.

---

## 📂 Struktur Repositori

Agar rapi dan memisahkan antara kode sumber (`.java`) dan hasil kompilasi (`.class`), file dan kode diatur dengan struktur berikut:

```text
Java_SMT3/
├── 01-class-and-object/ # Implementasi dasar Class dan Object
├── 02-encapsulation/    # Latihan access modifiers dan encapsulation
├── 03-inheritance/      # Latihan pewarisan (extends)
├── 04-polymorphism/     # Latihan polimorfisme (overriding & overloading)
├── 05-abstraction/      # Latihan Abstract Class dan Interface
├── percobaan/           # Eksperimen kode bebas
│   ├── src/             # Kode sumber (.java)
│   └── bin/             # Hasil kompilasi (.class)
└── README.md            # Dokumentasi repositori
```

_(Catatan: Struktur folder ini akan terus diperbarui seiring berjalannya semester)_

# 🛠️ Prasyarat & Cara Menjalankan (How to Run)

Semua kode dalam repositori ini murni ditulis menggunakan Java. Untuk menjalankan file-file yang ada di sini, pastikan Anda memiliki compiler Java seperti JDK (Java Development Kit) di sistem operasi Anda.
Langkah-langkah menjalankan kode melalui terminal:

```bash

# Buka terminal pindah ke folder CPP kalian
cd nama_folder/

# compile file cpp kalian ke bentuk file binary
g++ coba.cpp -o coba

# jalankan file binary yang sudah di compile tadi
./coba

```

**DISCLAIMER : DEVICE YANG DIGUNAKAN MENGGUNAKAN LINUX FEDORA YANG COCOK UNTUK DEVELOPMENT DAN SELALU UPDATE, JADI MUNGKIN TIDAK COMPATIBLE DENGAN BEBERAPA OS LAIN ATAU DEVICE LAIN😉😉**

Dibuat dan dirawat oleh GoBlock1938 untuk pembelajaran Semester 3.

**Saran Tambahan untuk Anda:**
Mengingat saat ini Anda baru memiliki file `coba.cpp` [3], saya sangat menyarankan Anda untuk mulai memindahkan file tersebut ke dalam folder khusus seperti `percobaan/` atau `eksperimen/` agar halaman utama repositori Anda tidak berantakan seiring bertambahnya jumlah file ke depannya.
