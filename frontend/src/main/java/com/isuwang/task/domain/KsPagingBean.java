package com.isuwang.task.domain;

import org.apache.commons.lang.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 分页对象
 *
 * @author tianya
 * @description
 * @date 2013-8-22
 */
public class KsPagingBean<C, D> {

    public static final String PAGING_BEAN = "pagingBean";

    public static final String DIRECTION_ASC = "asc";

    public static final String DIRECTION_DESC = "desc";

    //
    private Map<String, String> statusCount;

    private Map<String, String> processStatusCount;

    // name asc,age desc
    private String sortFields;

    /**
     * 排序字段
     */
    private String field;


    private C condition;

    /**
     * 方向
     */
    private String direction;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 总记录数
     */
    private Integer results;

    /**
     * 查询的结果
     */
    private Boolean result;

    /**
     * 表格结果列
     */
    private List<D> rows;

    /**
     * 某次查询的起始记录
     */
    private Integer start;

    /**
     * 当前页
     */
    private Integer pageIndex;

    /**
     * 页大小
     */
    private Integer limit;


    private Class domainClass;

    /**
     * 页面权限
     */
    private Map<String, String> actions = new HashMap<>();

    public void setDomainClass(Class domainClass) {

        this.domainClass = domainClass;
    }

    /**
     * @return String
     * @throws
     * @Title: getSortInfo
     * @Description: 获取排序信息
     */
    public String getSortInfo() {
        return StringUtils.EMPTY;
    }

    public Integer getPageIndex() {

        return pageIndex == null ? 0 : pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {

        this.pageIndex = pageIndex;
    }

    public Integer getLimit() {

        return limit == null ? 30 : limit;
    }

    public void setLimit(Integer limit) {

        this.limit = limit;
    }


    public Integer getResults() {

        return results;
    }

    public Map<String, String> getStatusCount() {
        return statusCount;
    }

    public void setStatusCount(Map<String, String> statusCount) {
        this.statusCount = statusCount;
    }

    public void setResults(Integer results) {
        this.results = results;
        this.pageIndex = this.getStart() / this.getLimit();
        double d = Math.ceil(this.results / this.getLimit());
        int totalPage = this.results / this.getLimit();
        if (this.results % this.getLimit() != 0) {
            totalPage = totalPage + 1;
        }

        if (totalPage == 0) totalPage = 1;
        this.totalPage = totalPage;
    }

    public Boolean getResult() {

        return result;
    }

    public void setResult(Boolean result) {

        this.result = result;
    }

    public List<D> getRows() {

        return rows;
    }

    public void setRows(List<D> rows) {

        this.rows = rows;
    }

    public Integer getTotalPage() {

        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {

        this.totalPage = totalPage;
    }

    public String getField() {

        return field;
    }

    public void setField(String field) {

        this.field = field;
    }

    public String getDirection() {

        return direction;
    }

    public void setDirection(String direction) {

        this.direction = direction;
    }

    public Integer getStart() {

        return start == null ? 0 : start;
    }

    public String getSortFields() {
        return sortFields;
    }

    public void setSortFields(String sortFields) {
        this.sortFields = sortFields;
    }

    public void setStart(Integer start) {

        this.start = start;
    }

    public C getCondition() {

        return condition;
    }

    public void setCondition(C condition) {

        this.condition = condition;
    }

    public Map<String, String> getProcessStatusCount() {
        return processStatusCount;
    }

    public void setProcessStatusCount(Map<String, String> processStatusCount) {
        this.processStatusCount = processStatusCount;
    }

    public Map<String, String> getActions() {
        return actions;
    }

    public void setActions(Map<String, String> actions) {
        this.actions = actions;
    }
}
