<h1 align="center">Resume - Web UI Testing With Serenity</h1>
<h3 align="center">Diana Kusuma - Kelas QE - B</h3>


<h2 align="center">Web UI Testing With Serenity</h2>

Web Automation Testing adalah cara untuk menguji dan mengotomatisasi pengujian pada situs web atau aplikasi web. Cara kerjanya dapat diibaratkan seperti proses yang dilakukan oleh manusia saat mengakses dan berinteraksi dengan sebuah situs web. Namun, dalam pengujian otomatis, tindakan-tindakan ini dilakukan oleh perangkat lunak atau skrip pengujian alih-alih manusia.

Beberapa tools yang digunakan untuk automation testing: Katalon, Cypress, robot framework, dan test projrct.
-	Serenity BDD adalah sebuah library open source yang membantu tester dalam menulis automation exception test yang terstruktur dan menghasilkan laporan pengujian yang kaya akan makna dan di kenal dengan "Living Documentation".

Beberapa arsitektur dalam serenity BDD yaitu Page, requirments, test, dan, reports.
Yang harus dilakukan sebelum web automation?

> 1. Melakukan pendefinisian requirment, seperti membuat stories.
> 2. Kriteria dalam penerimaan automation.
> 3. Mengimplementasikan test.
> 4. Menghasilkan report.

-	Jbehave adalah framwork BDD yang ditulis dalam bahasa java dan memiliki beberapa kelebihan. BDD sendiri merupakan hasil pengembangan dari TDD (Test Driven Development).

Step by step menggunakan BDD with JBehave?
1. **Menulis Cerita (Write Story)**: Langkah pertama adalah menulis cerita pengguna atau skenario pengujian dengan menggunakan sintaksis Gherkin. mendefinisikan langkah-langkah dalam format "Given" (kondisi awal), "When" (tindakan yang dilakukan), dan "Then" (validasi). Ini membantu dalam merinci perilaku yang diharapkan dari sistem.

2. **Konfigurasi Stories (Configuration Stories)**: Konfigurasi stories adalah langkah di mana menentukan stories mana yang akan dijalankan dan mengatur format output yang digunakan jika hanya menggunakan JBehave. Anda juga dapat mengatur berbagai properti pengujian, seperti timeout atau pengaturan lainnya.

3. **Interaksi dengan Browser (Browser Interaction)**: Setelah menulis cerita dengan sintaksis Gherkin, perlu menghubungkan cerita-cerita ini dengan kode Java yang akan melakukan interaksi sebenarnya dengan aplikasi web atau sistem yang diuji. Ini melibatkan pemetaan langkah-langkah Gherkin dengan metode Java yang sesuai untuk melakukan interaksi dengan elemen-elemen web.

4. **Menjalankan Cerita (Run Stories)**: menjalankan cerita-cerita yang telah didefinisikan dengan menggunakan alat seperti JUnit atau Maven. Ini akan mengaktifkan eksekusi cerita-cerita sesuai dengan skenario yang telah tentukan dalam cerita.

5. **Melihat Laporan (View Report)**: Setelah menjalankan cerita-cerita, dapat melihat laporan hasil pengujian. JBehave biasanya menghasilkan laporan berbasis teks yang mencakup detail tentang skenario-skenario yang diuji, apakah mereka berhasil atau gagal, serta pesan-pesan kesalahan jika ada. Jika menggunakan kerangka kerja BDD seperti Serenity, akan mendapatkan laporan yang lebih terstruktur dan mudah dibaca.
