## 📄 Pretest Spring Boot Security & Unit Testing\*\*

### ✅ **A. Pilihan Ganda (12 Soal)**

1. Apa tujuan utama dari Spring Security? Untuk mengatur autentikasi dan autorasi dalam pengembangan aplikasi
2. Apa anotasi untuk mengaktifkan Web Security di Spring Boot? @EnableWebSecurity
3. Apa fungsi `HttpSecurity` dalam konfigurasi Spring Security? memberi keamanan HTTP
4. Apa itu prinsip _Authentication Principal_ dalam Spring Security? representasi dari user yang sedang login
5. Apa peran dari anotasi `@PreAuthorize("hasRole('ADMIN')")`? mendefinisikan suatu user memiliki autentikasi atau autorisasi sebagai admin
6. Apa fungsi dari class `UserDetails` di Spring Security? menampilkan detail user
7. Apa itu BCrypt? teknik enkripsi yang paling aman karena mengimplementasikan salt didalam proses dan untuk decrypt nya lamban sehingga bruteforce tercegah
8. Library utama yang digunakan untuk testing unit di Spring Boot adalah: TestUnit
9. Apa kegunaan dari `@MockBean` dalam Spring Boot Test? memungkinkan Bean dapat di-mock
10. Apa yang dilakukan oleh anotasi `@WithMockUser`? membuat user mock/dummy
11. Apa perbedaan mendasar antara `@WebMvcTest` dan `@SpringBootTest`? springboot memuat seluruh aplikasi - model,service,controller,dll. sedangkan webmvc hanya lapisan terluar (controller)
12. Apa tujuan dari anotasi `@BeforeEach` dalam unit test? menjalankan kode sebelum setiap suatu kondisi

---

### ✅ **B. Benar/Salah (5 Soal)**

13. `BCryptPasswordEncoder` menghasilkan hash yang sama untuk password yang sama. F
14. Spring Security dapat digunakan untuk endpoint berbasis REST API maupun form login. T
15. `@WebMvcTest` bisa digunakan untuk menguji layer service dan repository. F
16. `Principal` adalah representasi dari user yang sedang login. T
17. `@MockBean` dan `@Mock` memiliki efek yang sama dalam Spring Boot Test. F

---

### ✅ **C. Isian Singkat (5 Soal)**

18. Apa peran dari `AuthenticationManager` dalam Spring Security? me-manage autentikasi dan verifikasi user
19. Jelaskan apa yang dilakukan oleh `PasswordEncoder` dan kenapa penting? mengubah password dari plaintext ke encoded string untuk meningkatkan keamanan password pengguna
20. Apa yang dimaksud dengan "authorization" dalam konteks aplikasi? mengatur apa saja yang dapat dan tidak dapat diakses oleh suatu pengguna
21. Apa itu _test double_, dan apa perbedaannya dengan _mock_ di unit test? test double membuat clone testing sedangkan mock untuk akun dummy
22. Dalam pengujian REST API Spring Boot, apa fungsi utama `MockMvc`? membuat semacam sandbox sehingga proses dapat diuji tidak di aslinya 

---

### ✅ **D. Koreksi Kode (8 Soal)**

Perhatikan kode berikut dan jelaskan apa yang salah.

23.

```java
@Autowired
private PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
}
```

24.

```java
@WithMockUser(username = "admin", roles = "ADMIN")
@Test
void testAccessAdminEndpoint() {
    mockMvc.perform(get("/admin")).andExpect(status().isOk());
}
```

25.

```java
@Mock
UserService userService(){
    return new UserServiceImpl();
}
```

26.

```java
@SpringBootTest
public class MyTest {
}
```

27.

```java
@Test
void testPasswordHash() {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    assertTrue("mypassword", encoder.encode("mypassword"));
}
```

28.

```java
@Test
void testUnauthorizedAccess() {
    mockMvc.perform(get("/secure-data"))
           .andExpect(status().isUnauthorized());
}
```

29.

```java
@BeforeAll
static void setup() {
    MockitoAnnotations.openMocks(this);
}
```

30.

```java
@Test
void testLogin() {
    when(authService.login("user", "pass")).thenReturn(new AuthResponse());
    assertNotNull(authService.login("user", "pass"));
}
```
