
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class ManagerTask {

    private List<Task> tasks = new ArrayList<>();
    ;  // để lưu trữ danh sách các công việc (Task).
    private int id = 1; // lưu trữ mã ID khi được add vào

    public ManagerTask() {
//        tasks = new ArrayList<>(); // khởi tạo ra một đối tg AL ms để lư trữ task
//        id = 1;
    }

    //Hàm boolean để kiểm tra các chỉ mục có bẳng nhau hay không và trả về nếu tồn tại. Còn hàm void không trả về giá trị 
    public boolean addTask(String name, String typeId, String date, double from, double to, String ass, String reviewer) throws Exception {
        if (idExisted(id) != -1) {
            throw new Exception("Id is already taken");
        }
        if (to <= from) {
            throw new Exception("Invalid time range. Task could not be added.");
        }
        Task task = new Task(id, name, typeId, date, from, to, ass, reviewer); // tạo đối tg task mới để lưu các thông tin được cung cấp trong tham số của phương thúc
        tasks.add(task); // dùng pt add của araylist để thêm đối tượng
        id++; // tự động tăng gtri id cho mỗi task đk thêm vào(để đảm bảo rằng mỗi công việc có một ID duy nhất.)
        return true; // task thêm vào tc 
    }

    private int idExisted(int id) {
        for (int i = 0; i < tasks.size(); i++) { // lặp các phtu trong list, biến i theo dõi chỉ mục của các ptu htaij
            if (tasks.get(i).getId() == id) { // check id của task tại vị trí thứ i hiện tại có -- với id đk truyền vào
                // tasks.get(i: truy cập vào ptu thu i trong task
                // getID truy cập vào gtri ID 
                return i; // chỉ ra id đã tồn tại
            }
        }
        return -1; // không tồn tại
    }

    public void showTasks() throws Exception {
        if (tasks.isEmpty()) {
            throw new Exception("The task list is empty");
        }
        for (Task task : tasks) {
            task.display();
        }
    }

    public boolean deleteTask(int id) throws Exception {
        if (tasks.isEmpty()) {
            throw new Exception("The task list is empty");
        }
        int taskIndex = idExisted(id);
        if (taskIndex == -1) {
            throw new Exception("Task with the given id does not exist");
        }
        tasks.remove(taskIndex); // xóa task tại vin trí index
        for (int i = taskIndex; i < tasks.size(); i++) {
            tasks.get(i).setId(tasks.get(i).getId() - 1);
        }
        //Sau khi xóa công việc, một vòng lặp được sử dụng để cập nhật id của các công việc còn lại. 
        //Bắt đầu từ taskIndex, id của mỗi công việc sẽ được giảm đi 1.

        return true;

    }
}
