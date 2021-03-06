package club.vasilis.xtwh.service;

import club.vasilis.xtwh.domain.Activity;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Vasilis
 * @date 2019/5/12 -22:15
 */

public interface ActivityService {
    List<Activity> findActivityAll() throws SQLException;

    /**
     * 根据分类显示，并转成json
     * @return
     * @throws Exception
     */
    String findActivityByTypeJson(String typeId) throws Exception;

    /**
     * 点击进入详情信息
     * @param id
     * @return
     * @throws Exception
     */
    Activity showDetails(String id) throws Exception;


    /**
     * 获取Activity的所有Json数据
     * @return
     * @throws SQLException
     */
    String getJsonActivityAll() throws SQLException;


    public void sava(Activity activity) throws SQLException;

    Activity getActivityById(String id) throws SQLException;

    int updateActivity(Activity activity) throws SQLException;

    void deleteActivityById(String id) throws SQLException;
}
