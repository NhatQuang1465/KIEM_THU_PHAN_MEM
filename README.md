# Kiểm thử phần mềm
## Thông tin sinh viên
- Họ và tên: Nguyễn Nhật Quang 
- Mã SV: BIT230346
## Tổng quan
Repository này chứa **2 project Maven** (module) được quản lý dưới một root project:
- `project1-CantUnsee`
- `unit-test`

Root project dùng để **quản lý multi-module Maven**, cho phép build tất cả module cùng lúc.

---

## Cấu trúc thư mục
```
my-repo/
├─ project1-CantUnsee/
│ ├─ pom.xml
│ └─ src/
│     └─ README.md
├─ unit-test/
│ ├─ .idea
│ ├─ .mvn
│ ├─ target
│ ├─ pom.xml
│ └─ src/
│      ├─ main
│      ├─ test
│      └─ README.md
├─ pom.xml # root pom quản lý các module
├─ .gitignore
└─ README.md
```

- `pom.xml` ở root: quản lý tất cả module con.
- `src/main/java`: chứa code chính.
- `src/test/java`: chứa code test.

---
# Bài Thực Hành Tuần 1 - Bài tập Làm quen Can't Unsee
## Mô tả bài tập
Trong kiểm thử phần mềm, việc phát hiện lỗi giao diện (UI) là cực kỳ quan trọng. Bài tập này sử dụng công cụ CantUnsee để kiểm tra khả năng phân biệt sự khác nhau giữa hai thiết kế về các yếu tố:

- Typography (Font chữ, độ đậm nhạt).
- Color & Contrast (Màu sắc và độ tương phản).
- Spacing & Alignment (Khoảng cách, padding, margin và căn chỉnh).
- Border & Radius (Viền và độ bo góc).
## Kết quả đạt được
- Cấp độ hoàn thành: Hard 
- Số điểm đạt được: 7630
## Ảnh minh chứng
<img width="1252" height="875" alt="image" src="https://github.com/user-attachments/assets/d97b513b-7d04-409a-975f-b2fae8b79b7a" />

 ---

# Bài Thực Hành Tuần 2 - Student Analyzer - Unit Testing Project
## 1. Mục tiêu
- Làm quen với kiểm thử đơn vị (Unit Testing) trong phát triển phần mềm
- Hiểu cách viết và chạy các ca kiểm thử tự động bằng JUnit
- Nâng cao kỹ năng phân tích yêu cầu và xây dựng test case
- Nhận thức được vai trò của kiểm thử đơn vị trong việc đảm bảo chất lượng phần mềm

---

## 2. Công cụ sử dụng
- Ngôn ngữ lập trình: Java
- Thư viện kiểm thử: JUnit 5
- Môi trường phát triển: IntelliJ IDEA
- Nền tảng quản lý mã nguồn: GitHub

---

## 3. Nội dung thực hiện
- Xây dựng lớp `StudentAnalyzer` để xử lý và phân tích danh sách điểm số học sinh
- Cài đặt các phương thức:
    - Đếm số học sinh đạt loại Giỏi (điểm ≥ 8.0)
    - Tính điểm trung bình của các điểm hợp lệ (từ 0 đến 10)
- Loại bỏ các dữ liệu không hợp lệ (điểm âm hoặc lớn hơn 10)
- Viết các ca kiểm thử đơn vị cho từng phương thức, bao gồm:
    - Trường hợp bình thường
    - Trường hợp biên (danh sách rỗng, giá trị 0 và 10)
    - Trường hợp dữ liệu không hợp lệ
- Thực hiện commit mã nguồn và quản lý công việc thông qua GitHub Issues

---

## 4. Nhận xét – Đánh giá
- Việc viết kiểm thử đơn vị giúp phát hiện lỗi logic sớm trong quá trình phát triển
- JUnit hỗ trợ kiểm thử tự động, giúp tiết kiệm thời gian và tăng độ tin cậy của chương trình
- Thông qua bài thực hành, em hiểu rõ hơn cách xây dựng test case phù hợp với yêu cầu bài toán
- Việc kết hợp AI tạo sinh giúp tối ưu quá trình lập trình và kiểm thử

---

## 5. Kết luận
- Kiểm thử đơn vị là bước quan trọng trong quy trình phát triển phần mềm
- Bài thực hành giúp củng cố kiến thức về kiểm thử và lập trình Java
- Kỹ năng viết unit test sẽ hỗ trợ hiệu quả cho các bài tập và dự án nhóm trong học phần cũng như trong thực tế
---

## Hướng dẫn sử dụng

### 1. Clone repository
```bash
git clone https://github.com/NhatQuang1465/KIEM_THU_PHAN_MEM
cd my-repo
```
### 2. Build toàn bộ module
```bash
mvn clean install
```
### 3. Chạy project
- Mỗi module hoạt động như một project Java Maven độc lập.

- Để chạy:

  - Mở module cần chạy (ví dụ project1, project2)

  - Tìm class Main (hoặc bất kỳ class chạy được)

  - Run trực tiếp từ IDE hoặc qua Maven