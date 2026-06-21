package practice;

import java.util.*;

//定义个泛型类 DAO<T>，在其中定义一个Map成员变量，Map的键为String类型，值为T类型。
//分别创建以下方法:
// (1) public void save(String id,T entity): 保存T类型的对象到Map成员变量中
// (2)public T get(String id):从 map 中获取 id对应的对象
// (3)public void update(String id,T entity):替换 map中key为id的内容,改为 entity 对象
// (4)public List<T>list():返回map 中存放的所有T对象
// (5) public void delete(String id):删除指定id对象
//定义一个User类:该类包含:private成员变量(int类型)id，age;(String类型)name。
//创建 DAO类的对象，分别调用其save、get、update、list、delete 方法来操作 User 对象,使用Junit单元测试类进行测试。
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO();
        dao.save("1",new User(1,20,"jake"));
        dao.save("2",new User(2,25,"jim"));
        dao.save("3",new User(3,19,"amy"));
        System.out.println(dao.get("2"));
        dao.update("1",new User(1,18,"jake"));
        System.out.println(dao.get("1"));
        List<User> list = dao.list();
        System.out.println(list);
        dao.delete("1");

    }
}
class DAO<T>{
    private Map<String,T> map = new HashMap<>();
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        return new ArrayList<>(map.values());
    }
    public void delete(String id){
        map.remove(id);
    }
}
class User{
    private int id;
    private int age;
    private String name;
    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return " id: " + id + ", age: " + age + ", name: " + name;
    }
}