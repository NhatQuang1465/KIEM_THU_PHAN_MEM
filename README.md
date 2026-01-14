# Kiểm thử phần mềm
## Thông tin sinh viên
- Nguyễn Nhật Quang 
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

# Bài Thực Hành Tuần 2 - Student Analyzer - Unit Testing Project
## Công nghệ sử dụng
- Java (JDK 17)
- Maven (dependency management)
- JUnit 5 + AssertJ (hoặc Hamcrest) cho unit test
- Ứng dụng Java đơn giản dùng để phân tích danh sách học sinh dựa trên điểm số, tập trung vào việc viết **unit test** bằng JUnit và tuân thủ quy trình phát triển có sử dụng GitHub Issues.

## Mô tả bài toán

Chương trình quản lý thông tin học sinh với các chức năng chính:

- Đếm số học sinh **giỏi** (điểm trung bình ≥ 8.0 và tất cả điểm thành phần ≥ 0 và ≤ 10)
- Tính **điểm trung bình** chỉ sử dụng các điểm **hợp lệ** (0–10)

Các hàm chính được triển khai trong class `StudentAnalyzer`:

- `countExcellentStudents(List<Student> students)` → trả về số học sinh giỏi
- `calculateValidAverage(List<Double> scores)` → tính trung bình các điểm hợp lệ


## Hướng dẫn sử dụng

### 1. Clone repository
```bash
git clone https://github.com/username/my-repo.git
cd my-repo
```
2. Build toàn bộ module
```bash
mvn clean install
```
3. Chạy project
Mỗi module là project Java chuẩn Maven.

Vào project1 hoặc project2 → chạy class Main hoặc các class bạn tạo.

4. Thêm module mới
Thêm folder module mới → tạo pom.xml Maven → thêm vào root pom.xml:

xml
Copy code
<modules>
    <module>project1</module>
    <module>project2</module>
    <module>project3</module>
</modules>
Git
Khởi tạo Git:

```bash
Copy code
git init
git add .
git commit -m "Initial commit"
Đẩy lên GitHub:
```
```bash
Copy code
git remote add origin https://github.com/username/my-repo.git
git branch -M main
git push -u origin main
```
