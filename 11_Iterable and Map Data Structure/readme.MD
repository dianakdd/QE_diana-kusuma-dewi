<h1 align="center">Resume - Iterable & Map Data Structur</h1>
<h3 align="center">Diana Kusuma - Kelas QE - B</h3>

<h2 align="center">Iterable & Map Data Structure</h2>

Iterable adalah sekumpulan data atau struktur data yang bisa diberi perulangan hirarkinya
-	Iterator = class yang memanage iterasi dari sebuah iterable, yang mengelolah bagian mana kita sudah mengelola bagian iterasi pada bagian iterable dan mengetahui data apa yang berikutnya dapat diambil dan cara mengambilnya
-	Collection = sekumpulan object atau data, collection merupakan turunan interface iterable
List = sebuah interface yang menyediakan cara untuk menyimpan data, list juga bisa menerima nilai/data yang sama. Urutan data list berdasar data tersebut diinputkan
-	Array list = data yang bisa disimpan array list sebanyak – banyaknya selagi computer dapat
-	Linked list = struktur data yang menyimpan setiap elemennya terhubung satu sama lain, yaitu denga menyimpan Alamat memori dari elemen sebelumnya.
-	Immutable list = bagian dari list namun tidak dapat diubah datanya 
-	Stack = menyimpan data secara linear namun pengambilan datanya secara last in first out (ibarat tumpukan buku), stack memiliki beberapa method yaitu push (menambah data), pop (mengambil data) dan take (mentake data)
Set adalah sebuah struktur data yang dapat menyimpan sekumpulan data secara linerar, namun tidak menerima data duplicate.
-	Hash set = struktur data yang menyediakan cara tercepat untuk pencarian data
-	Linkedhash set = menyimpan insertion order, yang diinput terlebih dahulu di taruh depan
-	Enum set = digunakan untuk menyimpan nilai enum
-	Sorted set = set yang dapat menyimpan urutan data
-	Tree set = dalam penggunaan sorted set memerlukan treeset di dalamnya
-	Navigable set = untuk mengguanakn navigation pada sorted set
-	Queue = mengimplementasi first in first out, data yang lebih dulu dimasukkan akan lebih dulu diambil
-	Deque = sebuah queue yamg memiliki sebuah ujung

Map adalah struktur data yang ada di java untuk menyimpan banyak data di dalamnya yang diidentifikasi oleh Q dan setiap Q memiliki datanya sendiri yang disebut value. Method yang dapat dijlankan dalam menjalankan sebuah map adalah
-	Hash map = implementasi dari map yang menggunakan algoritma struktur data hash table
-	Weak hash map = masih menggunakan hash table namun pada weak hashmap bagian q dapat dihilangkan Ketika tidak digunakan
-	Identity hash map = masih menggunakan hash table, namun Ketika memiliki refrensi data yang berbeda maka hasilnya akan berbeda
-	Linked hash map = tidak ada perbedaan signifikan dengan hash map namun disini menggunakan doubly linked list sebagai struktur data di tablenya
-	Immutable map = map dalam bentuk ini tidak dapat diubah isinya 
Sorted map artinya map yang dapat diurutkan baik secara ascending atau descending
-	With comprator = dengan menjalankan data yang kompleks sebagai q maka perlu comparator yang kompleks juga
-	Navigable map = termasuk sorted map, namun menavigation method2 yang paling rendah
-	
