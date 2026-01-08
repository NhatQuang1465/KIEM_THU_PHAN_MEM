# My Multi-Module Maven Project

## Tổng quan
Repository này chứa **2 project Maven** (module) được quản lý dưới một root project:
- `project1`
- `

Root project dùng để **quản lý multi-module Maven**, cho phép build tất cả module cùng lúc.

---

## Cấu trúc thư mục
```
my-repo/
├─ project1/
│ ├─ pom.xml
│ └─ src/
├─ project2/
│ ├─ pom.xml
│ └─ src/
├─ pom.xml # root pom quản lý các module
├─ .gitignore
└─ README.md
```

- `pom.xml` ở root: quản lý tất cả module con.
- `src/main/java`: chứa code chính.
- `src/test/java`: chứa code test.

---

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
