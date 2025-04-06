package dao;

import domain.Account;
import domain.PageBean;

import java.util.Map;

/**
 * @author 陌意随影
 * @create 2020-01-31 17:33
 * @desc 账户的dao
 **/
public interface AccountDao extends DAO<Account> {
    /**
     * @Description :通过只封装了用户名和密码的账户来向数据库中查询并获取完整的用户信息
     * @Date 13:50 2020/2/1 0001
     * @Param * @param account ： 封装了用户名和密码的账户
     * @return domain.Account   查找到则返回完整信息的对象，否则返回null
     **/
    Account login(Account account);
    /**
     * @Description :  通过数据的起始位置，页面大小，查询条件，排序的名称以及排序方式来进行获得排序的对象
     * @Date 12:58 2020/2/2 0002
     * @Param * @param offset  数据的起始位置
     * @param pageSize  页面的大小
     * @param condition ：  查询的条件
     * @param tableSortName 排序的列名
     * @param tableOrder 排序的方式
     * @return domain.PageBean<domain.Book>
     **/
    PageBean<Account> findAccountByPage(int offset, int pageSize, Map<String, String> condition, String tableSortName, String tableOrder);
    /**
     * @Description :通过账号名来获取用户
     * @Date 13:49 2020/2/5 0005
     * @Param * @param user ：
     * @return domain.Account
     **/
    Account findAccountByName(String name);
    /**
     * @Description : 通过数据的起始位置，页面大小，搜索的条件，排序的名称以及排序方式来进行获得排序的对象
     * @Date 18:59 2020/2/2 0002
     * @Param * @param offset
     * @param pageSize   页面的大小
     * @param fuzzySearchContent  模糊搜索的内容
     * @param tableSortName  排序的列名
     * @param tableOrder ：排序的方式
     * @return domain.PageBean<domain.Book>
     **/
    PageBean<Account> fuzzySearchABookByPage(int offset, int pageSize, String fuzzySearchContent, String tableSortName, String tableOrder);
}
