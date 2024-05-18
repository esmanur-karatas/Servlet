# Login Uygulaması
Bu proje, basit bir kullanıcı girişi doğrulama işlemi gerçekleştiren bir Java Servlet uygulamasıdır. Kullanıcı adı ve şifre girişlerini kontrol eden bu uygulama, doğru bilgiler girildiğinde "GİRİŞ BAŞARILI" mesajını gösterir.

### Bu projeyi yerel makinenizde çalıştırmak için aşağıdaki adımları takip edebilirsiniz:

- Proje Dosyalarını İndirin:
 - Proje dosyalarını GitHub deposundan klonlayın.
 - Gerekli Bağımlılıkları Kurun:

  - Apache Tomcat veya benzeri bir Servlet Container kurulu olmalıdır.
  - Jakarta Servlet API kütüphanesi projenizde yer almalıdır.
- Projenizi Derleyin ve Dağıtın:
  - Projeyi derleyin ve WAR dosyasını oluşturun.
  - WAR dosyasını Tomcat webapps dizinine kopyalayın ve Tomcat'i başlatın.

## Kullanım
- Proje çalıştırıldıktan sonra, aşağıdaki adımları izleyerek uygulamayı kullanabilirsiniz:

- Web Tarayıcınızı Açın ve aşağıdaki URL'ye gidin:

  - http://localhost:8080/login.html
- Kullanıcı Adı ve Şifre Girin:

 - Kullanıcı Adı: admin
 - Şifre: 1234
 - Giriş Yap Butonuna Tıklayın ve sonuç mesajını görün.

## Kod Açıklamaları
### HTML Formu
- login.html dosyası, kullanıcı adı ve şifre girişi için bir form içerir.
- Form, POST yöntemi ile Login Servlet'ine gönderilir.

### Login Servlet
- Login.java dosyası, kullanıcı giriş bilgilerini doğrulayan bir Servlet içerir.
- doGet metodu, GET isteği alındığında kullanıcıyı login sayfasına yönlendirir.
- doPost metodu, POST isteği alındığında kullanıcı adı ve şifreyi kontrol eder ve uygun mesajı döner.
