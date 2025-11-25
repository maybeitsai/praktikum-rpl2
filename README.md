# Praktikum Rekayasa Perangkat Lunak 2 (RPL 2)

Repository ini berisi kumpulan kode sumber dan tugas untuk mata kuliah Praktikum Rekayasa Perangkat Lunak 2. Setiap pertemuan membahas topik yang berbeda, mulai dari dasar-dasar Java hingga pengembangan aplikasi web menggunakan Spring Boot.

## 📋 Daftar Isi

- [Deskripsi Proyek](#deskripsi-proyek)
- [Struktur Repository](#struktur-repository)
- [Teknologi yang Digunakan](#teknologi-yang-digunakan)
- [Prasyarat](#prasyarat)
- [Cara Menjalankan](#cara-menjalankan)
- [Penulis](#penulis)

## 📖 Deskripsi Proyek

Proyek ini disusun berdasarkan modul pertemuan praktikum, di mana setiap folder mewakili satu sesi pembelajaran. Tujuan dari praktikum ini adalah untuk memahami konsep rekayasa perangkat lunak modern menggunakan bahasa pemrograman Java dan framework terkait.

## 📂 Struktur Repository

Berikut adalah rincian materi yang dipelajari pada setiap pertemuan:

| Folder     | Topik                | Deskripsi Singkat                                                                                                                      |
| :--------- | :------------------- | :------------------------------------------------------------------------------------------------------------------------------------- |
| **Pert 1** | Pengenalan Java      | Program konsol sederhana untuk input/output dan logika kondisional (Cek Kelulusan).                                                    |
| **Pert 2** | Konsep OOP           | Implementasi konsep Object-Oriented Programming (Class, Object, Inheritance) dengan studi kasus User, Admin, Buyer, dan Seller.        |
| **Pert 3** | JDBC Connection      | Pengenalan koneksi database menggunakan Java Database Connectivity (JDBC) dengan MySQL.                                                |
| **Pert 4** | Hibernate ORM        | Implementasi Object-Relational Mapping (ORM) menggunakan framework Hibernate untuk interaksi database yang lebih efisien.              |
| **Pert 5** | Spring Boot Basic    | Pengenalan Spring Boot, Spring Data JPA, dan konfigurasi aplikasi web sederhana.                                                       |
| **Pert 6** | Spring Boot Advanced | Pengembangan lanjut dengan Spring Boot, penggunaan Lombok untuk mengurangi boilerplate code, dan struktur project yang lebih kompleks. |
| **Pert 7** | Dokumentasi          | Berisi dokumen tugas dan laporan akhir praktikum.                                                                                      |

## 🛠 Teknologi yang Digunakan

- **Bahasa Pemrograman**: Java (JDK 21)
- **Build Tool**: Apache Maven
- **Database**: MySQL
- **Frameworks & Libraries**:
  - Spring Boot (v3.3.3)
  - Spring Data JPA
  - Hibernate ORM
  - Lombok
  - MySQL Connector/J

## ⚙️ Prasyarat

Sebelum menjalankan proyek ini, pastikan Anda telah menginstal:

1.  **Java Development Kit (JDK)** versi 21 atau yang lebih baru.
2.  **Apache Maven**.
3.  **MySQL Server** (untuk Pertemuan 3 ke atas).
4.  IDE seperti **IntelliJ IDEA**, **NetBeans**, atau **VS Code**.

## 🚀 Cara Menjalankan

1.  **Clone Repository**

    ```bash
    git clone https://github.com/maybeitsai/praktikum-rpl2.git
    cd praktikum-rpl2
    ```

2.  **Menjalankan Modul (Contoh: Pert 6)**
    Masuk ke direktori modul yang ingin dijalankan:

    ```bash
    cd "Pert 6/Pert 6"
    ```

3.  **Konfigurasi Database**
    Untuk Pertemuan 3 hingga 6, pastikan Anda telah membuat database yang sesuai dan menyesuaikan konfigurasi di `src/main/resources/application.properties` atau `hibernate.cfg.xml`.

4.  **Build dan Run**
    Menggunakan Maven:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## 👤 Penulis

- **Nama**: Harry Mardika
- **NPM**: 50422657
- **Kelas**: 4IA01
- **Universitas**: Universitas Gunadarma

---

_Dibuat untuk memenuhi tugas Praktikum Rekayasa Perangkat Lunak 2._
