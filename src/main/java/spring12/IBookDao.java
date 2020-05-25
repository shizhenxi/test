package spring12;

/**
 * 图书数据访问接口
 */
public interface IBookDao {

     /**
      * 添加图书
      * @param name
      */
     void save(String name);
}
