# Student Analyzer - Unit Testing Project
## Thông tin sinh viên
- Nguyễn Nhật Quang
- Mã SV: BIT230346
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

## Cấu trúc thư mục dự án
```
unit-test/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/student/
│   │           ├── Student.java              (model)
│   │           ├── StudentAnalyzer.java      (chứa logic chính)
│   │           └── StudentApplication.java   (class main - optional)
│   └── test/
│       └── java/
│           └── com/example/student/
│               └── StudentAnalyzerTest.java  (các test case JUnit)
├── pom.xml                 (Maven configuration)
├── README.md
└── .gitignore
```

## Yêu cầu công việc & GitHub Issues

Dự án được thực hiện theo quy trình issue-driven development với ít nhất 4 issues sau:

| # | Tiêu đề Issue                              | Mô tả ngắn gọn                                      | Gợi ý label     |
|---|--------------------------------------------|-----------------------------------------------------|-----------------|
| 1 | Viết hàm countExcellentStudents()          | Xử lý kiểm tra điểm hợp lệ và đếm học sinh giỏi     | enhancement     |
| 2 | Viết hàm calculateValidAverage()           | Tính trung bình các điểm hợp lệ (bỏ điểm không hợp lệ) | enhancement |
| 3 | Viết test cho 2 hàm trên                   | Sử dụng JUnit kiểm thử đầy đủ các trường hợp biên   | test            |
| 4 | Viết tài liệu README.md                    | Mô tả bài toán, cách chạy chương trình, cách test   | documentation   |

### Commit message quy ước

Mỗi commit phải liên kết với issue tương ứng, ví dụ:
- feat: implement countExcellentStudents() #1
- feat: add calculateValidAverage() with input validation #2
- test: add unit tests for countExcellentStudents and calculateValidAverage #3
- docs: update README with project description and running instructions #4
### Các lệnh Maven phổ biến

```bash
# Build dự án và chạy test
mvn clean install

# Chỉ chạy test
mvn test

# Chạy chương trình chính (nếu có class main)
mvn exec:java -Dexec.mainClass="com.example.student.StudentApplication"
```
## Cách chạy unit test
Tất cả test nằm trong file src/test/java/com/example/student/StudentAnalyzerTest.java
Chạy toàn bộ test bằng lệnh:
```bash
mvn test
```