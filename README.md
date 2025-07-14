### 1. Spring Initializr
```
- Project: Maven
- Language: Java
- Spring Boot: 3.5.4
```

---

### 2. Project Metadata
```
- Group: com.example
- Artifact (folder name): SE1-warehouse-management-system
- Name (application name - name of main class to run): WarehouseManagement
- Description: default
- Package name: com.example.SE1-warehouse-management-system
- Packing: Jar
- Java: 17
```

---

### 3. Dependencies
```
- Spring Web
- Spring JPA
- MySQL Driver
- Thymleaf
```

---

### 4. Project Structure
```
SE1-warehouse-management-system/
|
|______ ./src
|       |______ ./main
|               |______ ./java
|               |       |______ ./com.example.SE1-warehouse-management-system
|               |               |______ ./controller
|               |               |       |______ ProductController.java
|               |               |______ ./model
|               |               |       |______ Product.java
|               |               |______ ./repository
|               |               |       |______ ProductRepository.java
|               |               |______ ./service
|               |               |       |______ ProductService.java
|               |               |______ WarehouseManagementApplication.java
|               |______ ./resources
|                       |______ ./static                                        # CSS, JS, images
|                       |______ ./templates                                     # Thymeleaf views
|                       |       |______ product_form.html
|                       |       |______ product_list.html
|                       |______ application.properties
|
|______ .gitattributes
|______ .gitignore
|______ pom.xml
|______ README.md
```