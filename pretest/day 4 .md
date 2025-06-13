## 📄 **PRE-TEST** – _Java Spring Boot & Spring Security_

### ✳️ Bagian 1: Pilihan Ganda (Dasar)

1. Apa anotasi yang digunakan untuk mendefinisikan sebuah REST controller?

   - A. `@Service`
   - B. `@Component`
   - C. `@RestController`
   - D. `@Repository`

C

2. Di Spring, anotasi apa yang digunakan untuk menyuntikkan dependency ke dalam class?

   - A. `@Autowired`
   - B. `@Injectable`
   - C. `@Import`
   - D. `@Mapper`

A

3. Di lapisan arsitektur Spring, Service berfungsi untuk:

   - A. Menangani permintaan HTTP
   - B. Menyimpan data ke database langsung
   - C. Menyimpan log aplikasi
   - D. Menyimpan logika bisnis

D

4. Class model di Java Spring biasanya digunakan untuk:

   - A. Menyimpan konfigurasi Spring
   - B. Menyimpan logika controller
   - C. Menyimpan struktur data (seperti data user, produk, dll.)
   - D. Mengatur pemetaan URL

C

5. Jika kita ingin membuat method yang bisa diakses oleh endpoint `/hello`, anotasi apa yang digunakan?

   - A. `@RestEndpoint("/hello")`
   - B. `@Path("/hello")`
   - C. `@GetMapping("/hello")`
   - D. `@Route("/hello")`

C

---

### ✳️ Bagian 2: Benar / Salah

6. `@Service` digunakan untuk menandai class sebagai lapisan Controller.
F
7. Kita bisa membuat class model tanpa anotasi apapun jika hanya digunakan sebagai POJO.
T
8. `@Autowired` bisa digunakan di constructor maupun field.
T
9. Spring Boot membutuhkan file `application.yml` agar bisa berjalan.
F
10. `@GetMapping` hanya bisa digunakan di class dengan anotasi `@Service`.
F

---

### ✳️ Bagian 3: Isian Singkat

11. Anotasi apa yang digunakan agar method bisa menangani permintaan POST?

@POSTMapping

12. Apa nama file konfigurasi default di Spring Boot?

application.properties

13. Apa yang dimaksud dengan Dependency Injection?

objek secara otomatis depedensinya dari framework Spring

14. Bagaimana cara mendeklarasikan class `UserService` agar dikenali Spring sebagai Service?

@Service sebelumnya

15. Apa perbedaan `@RestController` dan `@Controller`?

RestController adalah Controller + ResponsBody outputnya JSON

---

### ✳️ Bagian 4: Perbaiki Kode / Output

16. Perbaiki kode berikut agar dapat dijalankan sebagai Controller:

```java
@RESTController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
```

17. Perbaiki kesalahan pada model berikut:

```java
public class Product {
    private String name;
    private int price;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }
}
```

18. Apa output dari method berikut?

```java
@GetMapping("/sum")
public int sum() {
    return 2 + 3;
}

5

```

19. Kode service berikut error. Apa yang salah?

```java
@Service
public class UserService {
    @Autowired
    private UserRepositor userRepository;
}
```

20. Apa masalah pada potongan kode berikut?

```java
@RestController
public class BookController {

    @GetMapping(/book)
    public String listBooks() {
        return "books";
    }
}
```

---

### 🔐 Bagian 5: Spring Security

#### Pilihan Ganda

21. Apa anotasi yang digunakan untuk mengaktifkan Spring Security di aplikasi Spring Boot?

- A. `@EnableSecurity`
- B. `@SpringSecurity`
- C. `@EnableWebSecurity`
- D. `@ActivateSecurity`

C

22. Komponen mana yang bertugas mengatur izin akses berdasarkan role atau otorisasi di Spring Security?

- A. `SecurityConfig`
- B. `UserDetailsService`
- C. `AuthenticationManager`
- D. `HttpSecurity`

D

23. Untuk membuat otentikasi berbasis user login yang dikustomisasi, interface apa yang harus diimplementasi?

- A. `UserRepository`
- B. `UserSecurity`
- C. `UserDetailsService`
- D. `SecurityService`

C

#### Benar / Salah

24. Spring Security hanya bisa digunakan untuk REST API yang menggunakan JWT.
F
25. `@PreAuthorize("hasRole('ADMIN')")` digunakan untuk membatasi method agar hanya bisa diakses oleh pengguna dengan role ADMIN.
T
26. `BCryptPasswordEncoder` digunakan untuk mengenkripsi password agar tidak disimpan dalam bentuk plain text.
T

#### Isian Singkat

27. Apa class konfigurasi yang umum dibuat untuk menyesuaikan aturan login, logout, dan authorization di Spring Security?

`SecurityConfig`

28. Apa anotasi yang digunakan agar method hanya bisa diakses jika pengguna memiliki hak tertentu?

RBAC PreAuthorize

#### Perbaiki Kode / Analisis

29. Perbaiki potongan konfigurasi ini:

```java
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .antMatchers("/admin").hasRole("ADMIN")
        .anyRequest().requiresSecure()
        .and()
        .formLogin();
    return http.build();
}

pake https jangan http

```

30. Apa yang salah dengan konfigurasi login berikut?

```java
http
  .authorizeHttpRequests()
  .anyRequest().authenticated()
  .and()
  .formLogin();

  permitAll -> authenticated supaya lebih aman

```

---
