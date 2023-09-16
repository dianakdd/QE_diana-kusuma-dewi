<h1 align="center">Resume - Pengenalan RESTful API</h1>
<h3 align="center">Diana Kusuma - Kelas QE - B</h3>

<h2 align="center">Pengenalan RESTful API</h2>

API adalah singkatan dari `Application Programming Interface`. Fungsi API sendiri adalah sebagai jembatan untuk menghubungkan antara klient dengan server/System.
RESTful API adalah sebuah pendekatan dalam desain dan implementasi API web yang didasarkan pada prinsip-prinsip REST.
> RESTful API terdiri dari metode HTTP (seperti `GET`, `POST`, `PUT`, `DELETE`) untuk mengidentifikasi jenis operasi yang akan dilakukan pada sumber daya.
- RESTful API mengizinkan operasi dasar untuk membuat, membaca, memperbarui, dan menghapus sumber daya melalui metode HTTP seperti
  - `GET` (untuk membaca data),
  - `POST` (untuk membuat data),
  - `PUT` (untuk memperbarui/Mengganti data), dan
  - `DELETE` (untuk menghapus data yang ada).

1. HTTP Method `GET`, `POST`, `PUT`, `DELETE`
2. URL/Uniform Resource Locator = yang mencakup alamat server dan path ke sumber daya (Endpoint).
3. Headers HTTP = digunakan untuk mengirim informasi tambahan dalam permintaan atau tanggapan. Misalnya, header Authorization digunakan untuk autentikasi.
4. Body = bagian pesan HTTP yang digunakan untuk mengirim data atau payload. Dalam permintaan HTTP, body berisi data yang dikirim oleh klien kepada server. Dalam tanggapan HTTP, body berisi data yang dikirim oleh server kepada klien sebagai respons.
5. Format data dalam body dapat bervariasi, seperti JSON `JavaScript Object Notation`, XML, atau tipe data lainnya biasanya digunakan baik untuk mengiirm request atau menerima respon.

HTTP Response Code adalah angka tiga digit yang dikirim oleh server web sebagai tanggapan terhadap permintaan yang dikirim oleh klien, baik itu pengguna atau perangkat lunak lainnya. Kode status HTTP menunjukkan apakah permintaan tersebut berhasil, gagal, atau memerlukan tindakan tambahan.

Berikut adalah beberapa contoh kode status HTTP yang umum digunakan:
- 200 OK : Permintaan berhasil, dan server mengembalikan data yang diminta.
- 201 Created : Sumber daya telah berhasil dibuat oleh server sebagai tanggapan terhadap permintaan.
- 204 No Content : Permintaan berhasil, tetapi tidak ada konten yang dikirim kembali sebagai respons.
- 400 Bad Request : Permintaan dari klien tidak dapat dipahami atau validasi gagal.
-  401 Unauthorized : Klien tidak memiliki otorisasi atau hak akses yang sesuai untuk mengakses sumber daya.
-  403 Forbidden : Server memahami permintaan, tetapi klien tidak diizinkan mengakses sumber daya.
- 404 Not Found : Sumber daya yang diminta tidak ditemukan di server.
- 405 Method Not Allowed : digunakan ketika server tidak mendukung atau mengizinkan metode HTTP yang digunakan dalam permintaan klien terhadap sumber daya tertentu.
- 500 Internal Server Error : Terjadi kesalahan di pihak server yang mengakibatkan respons yang tidak valid.
