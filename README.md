# Cycle Management System

## Giới thiệu
Cycle Management System là một ứng dụng quản lý xe và hồ sơ bảo trì. Ứng dụng này cho phép người dùng quản lý thông tin về phương tiện và hồ sơ bảo trì, đồng thời hỗ trợ quản lý người dùng với các quyền hạn khác nhau.

## Chức năng
- **Quản lý người dùng**: Thêm, cập nhật, xoá người dùng với các quyền hạn khác nhau (Admin, User).
- **Quản lý phương tiện**: Thêm, cập nhật, xoá thông tin phương tiện.
- **Quản lý hồ sơ bảo trì**: Thêm, cập nhật, xoá hồ sơ bảo trì.

## Công nghệ sử dụng
- **Java**: Ngôn ngữ lập trình chính.
- **Spring Boot**: Framework chính để xây dựng ứng dụng.
- **Spring Data JPA**: Để tương tác với cơ sở dữ liệu.
- **ModelMapper**: Để chuyển đổi giữa các lớp DTO và Entity.
- **Spring Security**: Để quản lý bảo mật và xác thực người dùng.
- **Hibernate**: ORM để quản lý các thao tác CRUD trên cơ sở dữ liệu.
- **Mysql**: Cơ sở dữ liệu.

## Cài đặt
### Yêu cầu hệ thống
- JDK 11 hoặc cao hơn
- Maven 3.6.3 hoặc cao hơn

### Hướng dẫn cài đặt
1. **Clone repository**:
   ```sh
   git clone https://github.com/username/CycleManagement.git
   cd CycleManagement

2. **Cấu hình cơ sở dữ liệu**:
- Mở tệp `application.properties` và cấu hình kết nối cơ sở dữ liệu nếu cần thiết.

3. **Chạy ứng dụng:**:
   ```sh
   mvn spring-boot:run

4. **Truy cập ứng dụng**:
- Mở trình duyệt và truy cập `http://localhost:8005`

## API Endpoints
### Authentication
- **Login**: `POST /api/auth`
    - Request Body:
      ```json
      {
        "email": "user@example.com",
        "password": "password"
      }
      ```

### User Management
- **Get all users**: `GET /api/users`
- **Get user by ID**: `GET /api/users/{id}`
- **Create new user**: `POST /api/users`
    - Request Body:
      ```json
      {
        "name": "User Name",
        "email": "user@example.com",
        "password": "password",
        "role": "ADMIN/USER"
      }
      ```
- **Update user**: `PUT /api/users/{id}`
    - Request Body:
      ```json
      {
        "name": "Updated Name",
        "email": "updated@example.com",
        "password": "updatedPassword",
        "role": "ADMIN/USER"
      }
      ```
- **Delete user**: `DELETE /api/users/{id}`

### Vehicle Management
- **Get all vehicles**: `GET /api/vehicles`
- **Get vehicle by ID**: `GET /api/vehicles/{id}`
- **Create new vehicle**: `POST /api/vehicles`
    - Request Body:
      ```json
      {
        "brand": "Brand Name",
        "model": "Model Name",
        "licensePlate": "ABC123",
        "year": "2024"
      }
      ```
- **Update vehicle**: `PUT /api/vehicles/{id}`
    - Request Body:
      ```json
      {
        "brand": "Updated Brand",
        "model": "Updated Model",
        "licensePlate": "XYZ789",
        "year": "2025"
      }
      ```
- **Delete vehicle**: `DELETE /api/vehicles/{id}`

### Maintenance Record Management
- **Get all maintenance records**: `GET /api/maintenances`
- **Get maintenance record by ID**: `GET /api/maintenances/{id}`
- **Create new maintenance record**: `POST /api/maintenances`
    - Request Body:
      ```json
      {
        "vehicleId": "1",
        "description": "Maintenance Description",
        "date": "2024-08-02",
        "cost": 100.0
      }
      ```
- **Update maintenance record**: `PUT /api/maintenances/{id}`
    - Request Body:
      ```json
      {
        "vehicleId": "1",
        "description": "Updated Description",
        "date": "2024-08-02",
        "cost": 150.0
      }
      ```
- **Delete maintenance record**: `DELETE /api/maintenances/{id}`

## Cấu trúc dự án
```plaintext
src
├── main
│   ├── java
│   │   └── com
│   │       └── nut
│   │           └── CycleManagement
│   │               ├── config
│   │               │   └── UserInfo.java
│   │               ├── controller
│   │               │   ├── AuthController.java
│   │               │   ├── MaintenanceRecordController.java
│   │               │   ├── UserController.java
│   │               │   └── VehicleController.java
│   │               ├── entities
│   │               │   ├── BaseEntity.java
│   │               │   ├── MaintenanceRecordEntity.java
│   │               │   ├── RoleEntity.java
│   │               │   ├── UserEntity.java
│   │               │   └── VehicleEntity.java
│   │               ├── models
│   │               │   ├── MaintenanceRecordDTO.java
│   │               │   ├── UserDTO.java
│   │               │   └── VehicleDTO.java
│   │               ├── services
│   │               │   ├── impl
│   │               │   │   ├── MaintenanceRecordServiceImpl.java
│   │               │   │   ├── RoleServiceImpl.java
│   │               │   │   ├── UserServiceImpl.java
│   │               │   │   └── VehicleServiceImpl.java
│   │               │   ├── MaintenanceRecordService.java
│   │               │   ├── RoleService.java
│   │               │   ├── UserService.java
│   │               │   └── VehicleService.java
│   │               └── util
│   │                   └── RoleEnum.java
│   └── resources
         └── application.properties
```
## Liên hệ

Nếu có bất kỳ câu hỏi hoặc thắc mắc nào, vui lòng liên hệ với tôi qua email: [nhutlm.02.work@gmail.com](mailto:nhutlm.02.work@gmail.com)

