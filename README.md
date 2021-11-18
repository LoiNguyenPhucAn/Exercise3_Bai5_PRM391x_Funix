# Exercise3_Bai5_PRM391x_Funix
Ứng dụng 12 cung hoàng đạo
Mô tả bài tập:
https://courses.funix.edu.vn/courses/course-v1:FUNiX+PRM391x_03-A_VN+2021_T7/courseware/9da95b86a80e4009925b5aa74dad5308/00745b8d090a4f3d95229b466eb0ef4f/?activate_block_id=block-v1%3AFUNiX%2BPRM391x_03-A_VN%2B2021_T7%2Btype%40sequential%2Bblock%4000745b8d090a4f3d95229b466eb0ef4f

Tạo 1 ứng dụng 12 cung hoàng đạo và xây dựng giao diện layout sau:

res/layout/m001_frg_menu.xml           
res/layout/m002_frg_detail

Sau khi đã tạo được 2 layout như trên. Hãy thực hiện tạo 2 class activity sau để xử lý logic:

a, Tại M001MenuActivity, set content cho nó quản lý layout m001_act_menu.xml

- Xử lý click vào các cung hoàng đạo thì:

Hiển thị ảnh cung hoàng đạo tương ứng ở khối nội dung bên dưới
Hiển thị tên cung tương ứng ở khối nội dung bên dưới
Hiển thị nội dung cung tương ứng ở khối nội dung bên dưới
- Xử lý click button Xem Thêm để di chuyển sang màn M002DetailActivity

Gửi kèm các thông tin gồm: Ảnh cung, tên cung, nội dung cung sang màn hình mới bằng cách sử dụng Intent.
b, Tại M002DetailActivity, set content cho nó quản lý layout m002_act_detail.xml

Nhận dữ liệu của màn hình M001 gửi sang, sau đó set giá trị cho các đối tượng View bên trong.
Xử lý click vào button Quay Lại để di chuyển về màn hình trước đó.
