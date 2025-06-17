## 📘 **PRETEST **

---
Theoaptra Kenny S

### 🔹 A. **Pilihan Ganda (20 Soal)**

#### ✅ Spring Boot Security

1. Anotasi yang digunakan untuk mengaktifkan Spring Security:
   A. `@EnableSecurity`
   B. `@EnableWebSecurity`
   C. `@EnableSpringBootSecurity`
   D. `@EnableSecureApp`

B

2. Apa itu `AuthenticationManager` dalam Spring Security?
   A. Komponen untuk mengatur authorization
   B. Class yang memproses autentikasi user
   C. Konfigurasi password encoder
   D. Token parser

B

3. Apa peran dari `@PreAuthorize("hasRole('ADMIN')")`?
   A. Mengatur login
   B. Menghindari token expiry
   C. Membatasi akses method hanya untuk ADMIN
   D. Menyimpan role ke database

C

4. Class `UserDetails` diimplementasikan untuk...?
   A. Konfigurasi JPA
   B. Logging REST request
   C. Representasi user dalam security context
   D. Mapping endpoint

C

5. Library umum untuk hashing password di Spring Security:
   A. AES
   B. MD5
   C. BCrypt
   D. HMAC256

C

---

#### 🌐 Basic REST API (Spring Web)

6. Anotasi `@RestController` adalah gabungan dari...?
   A. `@Controller` + `@RequestParam`
   B. `@Controller` + `@PathVariable`
   C. `@Controller` + `@ResponseBody`
   D. `@RequestMapping` + `@Service`

C

7. HTTP method `PUT` biasanya digunakan untuk...?
   A. Menghapus data
   B. Mengupdate atau mengganti resource
   C. Mengambil file
   D. Menyambungkan endpoint

B

8. Jika Anda ingin mengambil parameter dari `/product/{id}`, Anda akan menggunakan...?
   A. `@RequestParam`
   B. `@RequestHeader`
   C. `@PathVariable`
   D. `@PathParam`

C

9. Untuk membaca JSON body dan mengonversinya ke object Java, kita gunakan...?
   A. `@RequestMapping`
   B. `@RequestBody`
   C. `@PathVariable`
   D. `@GetMapping`

B

10. Kode status HTTP yang sesuai untuk `Resource Not Found`:
    A. 200
    B. 201
    C. 404
    D. 500

C

---

#### 🧩 Spring Data JPA

11. Anotasi `@Entity` di JPA digunakan untuk...?
    A. Mengatur mapping DTO
    B. Menandai class sebagai table di database
    C. Mendaftarkan bean service
    D. Mengatur konfigurasi Spring Boot

B

12. Apa tujuan dari `@Id` dalam entity class?
    A. Menandai kolom biasa
    B. Menyimpan objek transient
    C. Menandai primary key
    D. Mengatur sorting

C

13. Anotasi `@GeneratedValue(strategy = GenerationType.IDENTITY)` digunakan untuk...?
    A. Menyimpan record tanpa ID
    B. Membuat kolom unik
    C. Membiarkan database membuat ID otomatis
    D. Mengatur batch update

C

14. Apa peran `JpaRepository` dalam Spring Data?
    A. Konfigurasi controller
    B. Layer service REST
    C. Abstraksi akses data CRUD
    D. Mapping response JSON

C

15. Relasi One-to-Many di JPA ditandai dengan...?
    A. `@ManyToMany`
    B. `@OneToOne`
    C. `@OneToMany`
    D. `@Column(unique = true)`

C

---

#### 🧪 Unit Testing

16. Apa anotasi JUnit 5 untuk membuat method menjadi test unit?
    A. `@Run`
    B. `@TestCase`
    C. `@Test`
    D. `@Execute`

C

17. Mockito digunakan untuk...?
    A. Menyimpan object ke file
    B. Menguji performance
    C. Membuat object palsu (mock)
    D. Mengatur cache object

C

18. `@MockBean` biasanya digunakan di...?
    A. Spring Boot Application utama
    B. Test berbasis Spring context
    C. File konfigurasi YAML
    D. Static class

B

19. `MockMvc` berguna untuk...?
    A. Testing service layer
    B. Membuat dummy API
    C. Menguji controller REST tanpa menjalankan server
    D. Logging request

C

20. Apa tujuan dari anotasi `@BeforeEach`?
    A. Menjalankan test terakhir
    B. Setup sebelum setiap test method
    C. Cleanup setelah test
    D. Menentukan environment

B

---

### 🔸 B. **Benar / Salah (10 Soal)**

21. Spring Security secara default memblokir semua endpoint.
T
22. `@PathVariable` digunakan untuk membaca data dari query parameter.
F
23. `JpaRepository` menyediakan method seperti `findAll()` dan `save()`.
T
24. `@GeneratedValue` dapat digunakan bersama `@Id`.
T
25. Spring Boot membutuhkan konfigurasi manual untuk mapping JSON ke class.
F
26. `@RestController` hanya bisa digunakan untuk GET request.
F
27. `BCryptPasswordEncoder` menghasilkan hash yang konsisten tanpa salt.
F
28. Penamaan variable sebaiknya camelCase.
T
29. Nama class di Java sebaiknya menggunakan PascalCase.
T
30. `assertEquals(expected, actual)` digunakan untuk membandingkan dua nilai dalam unit test.
T

---

### 🧾 C. **Isian Singkat (5 Soal)**

31. Apa perbedaan antara `@RestController` dan `@Controller`?
restcontroller adalah controller yang ditambahkan requestbody, lgsg konversi ke JSON
32. Jelaskan fungsi `@ManyToOne` dan contoh penggunaannya dalam relasi data.
menandakan banyak entity terhubung ke 1 entity, contoh 1 user dapat punya banyak feedback
33. Apa itu `principal` dalam konteks Spring Security?
representasi user yang sedang login
34. Sebutkan dua konvensi penamaan dalam Java (untuk class dan variable).
PascalCase, camelCase
35. Mengapa penting menggunakan mocking saat membuat unit test?
karena pada proses testing agar tidak memengaruhi yang aslinya sehingga membuat dummy atau tiruannya

---

### 🔧 D. **Koreksi Kode (5 Soal)**

36.

```java
@Entity
public class Product {
    @ID
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
}
```

37.

```java
@GetMapping("/user/{id}")
public User getUser(@PathVariable Long id) {
    ...
}
```

38.

```java
@PostMapping("/register")
public String registerUser(@RequestBody User user) {
    ...
}
```

39.

```java
@Mock
UserService userService;
```

40.

```java
public class UserService {
    public void saveUser(User user) { ... }
}
```

---
