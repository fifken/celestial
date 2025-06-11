1. B. Mengelola logika aplikasi dan komunikasi data dengan database
2. A. Menyembunyikan detail implementasi dan menyediakan akses lewat method
3. C. Meng-inject dependency otomatis ke dalam bean
4. A. Agar controller lebih ringan dan fokus pada request/response
5. C. `@GetMapping("/api")`
6. F
7. T
8. T
9. F
10.T

11. Backend: bagaimana flow atau process dari suatu aplikasi diatur sesuai dengan logic app tersebut. Komunikasi antar User dengan database melalui request dan response dengan method yang sesuai
12. Class merupakan tempatnya dan object merupakan isi dari tempat tersebut. Object tidak bisa berdiri sendiri tanpa adanya class dengan kata lain class harus didefinisikan terlebih dahulu baru kita isi dengan object nya. 
13. Inheritance memungkinkan class B mewarisi atau mencontoh properties dan method dari class A (induk). Polymorphis memungkinkan objek berbeda merespons method yang sama dengan cara yang sesuai dengan object nya
14. agar class tersebut ditandai REST controller yang akan menerima request dan respon balik langsung sehingga akan auto convert ke JSON untuk memudahkan process komunikasi nya
15. menggunakan springboot akan lebih simple, mudah karena konfigurasi sudah diurus (otomatis) bisa digunakan untuk aplikasi yang ingin discalable kan
16. class harus diberikan tanda @ didepan lalu nanti jika mau dipanggil dengan menggunakan @Autowired
17. lebih mudah di-maintain karena dipisah sehingga jika ada perubahan tidak memengaruhi satu sama lainnya
18. tidak mengenali class dan tidak akan membuat object dari class itu
19. ketika Backend ingin mengambil data dari query parameter
20. service nya ditandai dengan @Service, lalu pada controller dibuatlah constructor

21.
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello(); // error -> harus didefinisikan dulu helloService nay
    }
}

22.
public class Person {
    public String name;

    public void Person(String name) { -> ga usah pakai void
        this.name = name;
    }
            |
            v
    public Person(String name) {
        this.name = name;
    }
}


23.

@RestController
public class GreetController {
    @PostMapping("/greet")
    public String greet(@RequestBody string name) { -> name tidak didefinisikan dulu dengan string (@RequestBody string name)
        return "Hello, " + name;
    }
}

24.

@Service
public class InfoService {
    public String getInfo() {
        return "Info OK";
    }
}

// controller
@RestController
public class InfoController {
    @GetMapping("/info")
    public String get() {
        InfoService info = new InfoService(); // langsung di-new
        return info.getInfo();
    }
}

tambahin @autowired sama seperti no 1 ?


25.


@RestController
public class MathController {
    @GetMapping("/add")
    public int addNumbers(int a, int b) { -> gaada @Requestparam di int a dan int b (@Requestparam int a, @Requestparam int b)
        return a + b;
    }
}

