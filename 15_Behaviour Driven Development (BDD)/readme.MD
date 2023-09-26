<h1 align="center">Resume - Behaviour Driven Development (BDD)</h1>
<h3 align="center">Diana Kusuma - Kelas QE - B</h3>


<h2 align="center">Behaviour Driven Development (BDD)</h2>

BDD merupakan proses software development yang menerapkan penulisan testcase sebelum developer menuliskan production code-nya. Proses BDD sendiri berfokus pada komponen-komponen dalam sistem dan testcase ditulis dalam berbahasa pemrograman. BDD juga menerapkan konsep test first namun dengan fokus yang berbeda, dalam bdd test identitas tim developer akan menuliskan berbagai skenario yang menjelaskan behavior  sistem dari perspektif pengguna, skenario dituliskan menggunakan format bahasa yang mudah dipahami oleh seluruh stakeholder dalam pengembangan system. Tujuan utamanya adalah untuk meningkatkan komunikasi dan kolaborasi antara seluruh stakeholder dengan tim bisnis maupun technical yang terlibat dalam pengembangan system. Hal ini dapat membantu memastikan bahwa fitur-fitur dalam sistem dapat dipahami dengan baik oleh seluruh anggota tim komunikasi yang baik dapat menyatukan persepsi stakeholders yang berbeda-beda dalam suatu pemahaman dan ekspektasi yang sama, serta fitur-fitur dalam sistem dapat memenuhi kebutuhan pengguna dan menghasilkan bisnis value. 
Prinsip dasar dari BDD adalah mendeskripsikan behavior dari sebuah sistem tanpa melibatkan penjelasan implementasinya. kunci dasar di BDD adalah mendeskripsikan behavior dari sebuah sistem tanpa melibatkan penjelasan implementasinya secara rinci terdapat pemisahan antara keduanya dalam pendekatan BDD seluruh stakeholder teknikal maupun non technical saling berkolaborasi untuk mendeskripsikan kebutuhan pengguna dan kebutuhan fungsional sistem yang dituliskan melalui picture file deskripsi yang ada dalam picture files berperan sebagai test logic yang kemudian akan menjadi dasar bagi QA. Dalam menuliskan test script untuk implementasi pengujian dan dasar bagi developer dalam menuliskan implementation untuk membangun system.
Picture files pada BDD dituliskan menggunakan Bahasa gherkin.

Terdapat 3 tahapan test pada BDD Format:
1.	Menentukan user story
Yaitu untuk menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan
2.	Menuliskan scenario
Menuliskan dengan gherkin syntax berdasarkan user story nya
3.	Mengimplementasikan test script dalam test files pada setiap scenario
Cth: 
-	Cara menjelaskan untuk kebutuhan Loginn =>  As a user I want to login to my account so that I can see my homepage
4.	Menerapkan 3 elemen utama scenario BDD
-	event = menjelaskan konteks dari skenario 
-	when = menjelaskan tindakan yang dilakukan oleh user 
-	then = menjelaskan outcome dari tindakan yang dilakukan oleh user 
Cucumber adalah sebuah tools yang mendukung BDD. Cucumber membaca sebuah ketentuan yang dapat dibaca oleh system yang dituliskan dengan text biasa. Step menjalankan BDD dengan cucumber:
1.	Menuliskan story dengan gherkin syntax
2.	Membuat step di java dengan membuat steps script nya dan validasinya
3.	Konfigurasikan story yaitu dengan mengkombinasikan story dan step – stepnya
4.	Running stories di intelij IDEA serta maven
5.	Melihat hasil reportnya
