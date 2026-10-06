# 🧮 Scientific Calculator

<div align="center">

**Aplikasi kalkulator ilmiah berbasis Java Swing dengan UI modern Dark Theme**

Dibangun menggunakan **Java Swing** dengan desain **Obsidian Dark Theme**, tombol rounded, riwayat kalkulasi, operasi matematika dasar, serta fungsi trigonometri dan matematika ilmiah.

<br>

![Java](https://img.shields.io/badge/Java-Swing-orange?style=for-the-badge\&logo=openjdk)
![UI](https://img.shields.io/badge/UI-Obsidian%20Dark%20Theme-6366F1?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-10B981?style=for-the-badge)

</div>

---

## ✨ Tentang Project

**Scientific Calculator** adalah aplikasi kalkulator desktop yang dibuat menggunakan **Java Swing**.

Aplikasi ini tidak hanya menyediakan operasi aritmatika dasar, tetapi juga dilengkapi dengan fungsi matematika seperti:

* ➕ Penjumlahan
* ➖ Pengurangan
* ✖️ Perkalian
* ➗ Pembagian
* √ Akar kuadrat
* x² Pangkat dua
* `sin` Sinus
* `cos` Cosinus
* `tan` Tangen
* `log` Logaritma basis 10
* `±` Mengubah tanda bilangan
* `⌫` Menghapus angka terakhir
* `AC` Menghapus kalkulasi
* 📜 Riwayat kalkulasi

Tampilan aplikasi menggunakan tema gelap dengan panel rounded dan warna berbeda untuk membedakan tombol angka, fungsi, operator, dan hasil.

---

## 🎨 Tampilan & Konsep UI

Aplikasi menggunakan konsep **Obsidian Dark Theme**.

Layout utama dibagi menjadi dua bagian:

```text
+-------------------------------------------------------------+
| Scientific Calculator                                 - [] X|
+-------------------------------------------------------------+
|  +-----------------------+  +----------------------------+  |
|  |           1,250 + 450 |  | Riwayat Kalkulasi          |  |
|  |                 1,700 |  | -------------------------- |  |
|  +-----------------------+  | 1,250 + 450 = 1,700        |  |
|                             | sin(90) = 1                |  |
|  [ v ] [x^2] [AC] [<x] [/]  | 5^2 = 25                   |  |
|  [sin] [ 7 ] [ 8 ] [ 9 ] [*]  | log(100) = 2             |  |
|  [cos] [ 4 ] [ 5 ] [ 6 ] [-]  |                          |  |
|  [tan] [ 1 ] [ 2 ] [ 3 ] [+]  |                          |  |
|  [log] [ +-] [ 0 ] [ . ] [=]  | [ Hapus Riwayat ]        |  |
|  +-----------------------+  +----------------------------+  |
+-------------------------------------------------------------+
```

Window aplikasi memiliki ukuran **850 × 500 px** dan dibuat tidak dapat di-resize agar layout tetap konsisten.

### 🌑 Color Palette

| Elemen            | Warna     |
| ----------------- | --------- |
| App Background    | `#0F111A` |
| Screen Background | `#181A26` |
| Border            | `#2A2D3E` |
| Number Button     | `#1F2232` |
| Function Button   | `#2D3148` |
| Operator Button   | `#6366F1` |
| Equal Button      | `#10B981` |
| Primary Text      | `#F3F4F6` |
| Secondary Text    | `#8F95B2` |
| Accent Text       | `#C7D2FE` |

Palet warna tersebut didefinisikan langsung pada class `ScientificCalculator`.

---

## 🚀 Fitur

### 1. Basic Arithmetic

Mendukung operasi matematika dasar:

```text
10 + 5 = 15
20 - 8 = 12
6 × 7 = 42
100 ÷ 4 = 25
```

Pembagian dengan angka `0` akan menghasilkan status:

```text
Error
```

untuk mencegah hasil pembagian yang tidak valid.

---

### 2. Scientific Functions

#### √ Square Root

Contoh:

```text
√144 = 12
```

Input negatif akan menghasilkan `Error`.

#### x² Square

Contoh:

```text
12² = 144
```

#### Trigonometry

Tersedia:

```text
sin
cos
tan
```

Nilai input untuk fungsi trigonometri diperlakukan sebagai **derajat (degree)**, bukan radian.

Contoh:

```text
sin(90) = 1
cos(0)  = 1
```

Implementasinya menggunakan `Math.toRadians()` sebelum perhitungan trigonometri.

#### log

Fungsi `log` menggunakan **logaritma basis 10**:

```text
log(100) = 2
```

Input `0` atau bilangan negatif akan menghasilkan `Error`.

---

## 📜 Calculation History

Setiap kalkulasi yang berhasil akan otomatis ditambahkan ke panel **Riwayat Kalkulasi**.

Contoh:

```text
10 + 20 = 30
√144 = 12
sin(90) = 1
5 × 8 = 40
```

Riwayat ditampilkan pada `JTextArea` dan dapat dihapus menggunakan tombol:

```text
Hapus Riwayat
```

---

## ⌨️ Keyboard Support

Aplikasi juga dapat dikontrol menggunakan keyboard.

### Angka

```text
0 1 2 3 4 5 6 7 8 9
```

### Operator

| Keyboard | Operasi     |
| -------- | ----------- |
| `+`      | Penjumlahan |
| `-`      | Pengurangan |
| `*`      | Perkalian   |
| `/`      | Pembagian   |
| `=`      | Hasil       |
| `Enter`  | Hasil       |

### Control

| Keyboard    | Fungsi               |
| ----------- | -------------------- |
| `Backspace` | Hapus angka terakhir |
| `Escape`    | Clear / AC           |
| `.`         | Desimal              |

Keyboard binding diimplementasikan menggunakan `InputMap` dan `ActionMap` Java Swing.

---

## 🧩 Struktur Program

Secara umum, program terdiri dari beberapa bagian utama:

```text
ScientificCalculator.java
│
├── ScientificCalculator
│   ├── UI Initialization
│   ├── Button Creation
│   ├── Keyboard Binding
│   ├── Command Processing
│   ├── Number Handling
│   ├── Operator Handling
│   ├── Calculation
│   ├── Scientific Operations
│   ├── History Management
│   └── Main Method
│
├── RoundedPanel
│   └── Custom rounded panel
│
└── RoundedButton
    ├── Rounded button UI
    ├── Hover effect
    └── Pressed effect
```

---

## 🏗️ Komponen Utama

### `ScientificCalculator`

Class utama yang merupakan `JFrame` sekaligus menangani event tombol melalui `ActionListener`.

```java
public class ScientificCalculator
        extends JFrame
        implements ActionListener
```

State kalkulator disimpan menggunakan beberapa variabel seperti:

```java
private double firstOperand = 0;
private String operator = "";
private boolean isNewInput = true;
```

---

### `RoundedPanel`

Custom component untuk membuat panel dengan sudut membulat.

Component menggunakan:

```java
RoundRectangle2D
```

dan mengaktifkan:

```java
RenderingHints.KEY_ANTIALIASING
```

sehingga tampilan panel terlihat lebih halus.

---

### `RoundedButton`

Custom button yang memberikan tampilan rounded serta efek interaksi.

Button memiliki tiga kondisi visual:

```text
Normal
   ↓
Hover
   ↓
Pressed
```

Warna button otomatis dibuat lebih terang saat cursor berada di atasnya dan lebih gelap saat ditekan.

---

## 🔢 Layout Tombol

Tombol kalkulator menggunakan grid **5 × 5**:

```text
┌─────┬─────┬─────┬─────┬─────┐
│  √  │ x²  │ AC  │ ⌫  │  ÷  │
├─────┼─────┼─────┼─────┼─────┤
│ sin │  7  │  8  │  9  │  ×  │
├─────┼─────┼─────┼─────┼─────┤
│ cos │  4  │  5  │  6  │  -  │
├─────┼─────┼─────┼─────┼─────┤
│ tan │  1  │  2  │  3  │  +  │
├─────┼─────┼─────┼─────┼─────┤
│ log │  ±  │  0  │  .  │  =  │
└─────┴─────┴─────┴─────┴─────┘
```

Layout ini didefinisikan melalui array pada source code.

---

## ⚙️ Cara Kerja Kalkulasi

Alur kalkulasi utama dapat digambarkan sebagai berikut:

```text
User Input
    │
    ▼
processCommand()
    │
    ├── Number
    │     └── handleNumber()
    │
    ├── Decimal
    │     └── handleDecimal()
    │
    ├── Operator
    │     └── handleBinaryOperator()
    │
    ├── =
    │     └── handleEquals()
    │
    ├── Scientific Function
    │     └── handleUnaryOperation()
    │
    └── Control
          ├── AC
          ├── Backspace
          └── ±
```

Semua input tombol terlebih dahulu diproses melalui `processCommand()`, kemudian diarahkan ke handler yang sesuai.

---

## 🛡️ Error Handling

Aplikasi memiliki beberapa validasi untuk kondisi matematika yang tidak valid.

### Division by Zero

```text
10 ÷ 0
```

Output:

```text
Error
```

### Negative Square Root

```text
√-10
```

Output:

```text
Error
```

### Invalid Logarithm

```text
log(0)
log(-10)
```

Output:

```text
Error
```

Validasi tersebut ditangani menggunakan kondisi matematika dan `ArithmeticException`.

---

## ▶️ Cara Menjalankan

### Requirements

Pastikan Java Development Kit (**JDK**) sudah terinstall.

Cek versi Java:

```bash
java -version
```

dan:

```bash
javac -version
```

---

### 1. Clone / Download Project

Jika project berada di repository Git:

```bash
git clone <repository-url>
cd <project-folder>
```

Atau cukup letakkan file:

```text
ScientificCalculator.java
```

dalam sebuah folder.

---

### 2. Compile

Jalankan:

```bash
javac ScientificCalculator.java
```

Jika proses berhasil, Java akan menghasilkan file `.class`.

---

### 3. Run

Jalankan:

```bash
java ScientificCalculator
```

Aplikasi kemudian akan membuka window kalkulator.

Method `main()` menjalankan aplikasi menggunakan:

```java
SwingUtilities.invokeLater(...)
```

sehingga UI dijalankan melalui Event Dispatch Thread Java Swing.

---

## 📁 Struktur Project

Untuk project sederhana, struktur dapat dibuat seperti:

```text
scientific-calculator/
│
├── ScientificCalculator.java
└── README.md
```

Jika dikembangkan lebih lanjut:

```text
scientific-calculator/
│
├── src/
│   └── ScientificCalculator.java
│
├── README.md
└── .gitignore
```

---

## 📊 Format Angka

Hasil kalkulasi diformat menggunakan:

```java
DecimalFormat("#.##########")
```

Dengan demikian hasil tidak ditampilkan dengan jumlah digit desimal yang berlebihan.

Selain itu, input angka dibatasi hingga **15 karakter** pada display.

---

## 💡 Contoh Penggunaan

### Perhitungan Aritmatika

```text
Input:
25 × 4

Output:
100
```

### Perhitungan Trigonometri

```text
Input:
sin(90)

Output:
1
```

### Pangkat

```text
Input:
12 → x²

Output:
144
```

### Akar

```text
Input:
144 → √

Output:
12
```

Setiap operasi yang berhasil juga dicatat pada panel history.

---

## 🎯 Tujuan Project

Project ini dapat digunakan sebagai contoh implementasi:

* Java GUI menggunakan Swing
* Event handling
* `ActionListener`
* `InputMap`
* `ActionMap`
* Object-oriented programming
* Custom Swing component
* Operasi matematika menggunakan `java.lang.Math`
* Pengelolaan state aplikasi
* Pembuatan UI dark theme
* Implementasi calculation history

---

## 🔮 Pengembangan Selanjutnya

Beberapa fitur yang dapat ditambahkan pada versi berikutnya:

* [ ] Tombol `π`
* [ ] Tombol `e`
* [ ] Pangkat dengan nilai bebas `xʸ`
* [ ] `1/x`
* [ ] Faktorial `n!`
* [ ] Modulo `%`
* [ ] Fungsi `ln`
* [ ] Mode radian
* [ ] Memory calculation (`M+`, `M-`, `MR`, `MC`)
* [ ] Tema Light/Dark
* [ ] Export riwayat kalkulasi
* [ ] Shortcut keyboard untuk fungsi scientific
* [ ] Responsif terhadap perubahan ukuran window

> Fitur-fitur di atas merupakan **ide pengembangan**, bukan fitur yang saat ini terdapat pada source code.

---

## 📝 Catatan

Aplikasi saat ini menggunakan Java Swing dan seluruh komponen UI berada dalam satu file `ScientificCalculator.java`.

Desain custom dibuat menggunakan `RoundedPanel` dan `RoundedButton`, sementara efek hover dan pressed dibuat melalui `MouseListener`.

---

## 👨‍💻 Teknologi

| Teknologi                | Penggunaan         |
| ------------------------ | ------------------ |
| **Java**                 | Bahasa pemrograman |
| **Java Swing**           | GUI                |
| **AWT**                  | Event & graphics   |
| **Math API**             | Operasi matematika |
| **DecimalFormat**        | Formatting hasil   |
| **RoundRectangle2D**     | Rounded UI         |
| **InputMap / ActionMap** | Keyboard shortcut  |

---

<div align="center">

### 🧮 Scientific Calculator

**Simple calculation. Scientific functions. Modern interface.**

Made with ❤️ using Java Swing.

</div>
