package com.isuwang.task.ctrl;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.soa.common.util.TPageRequest;
import com.isuwang.soa.task.TaskAdminServiceClient;
import com.isuwang.soa.task.TaskBusinessTypeServiceClient;
import com.isuwang.soa.task.TaskSuggestionServiceClient;
import com.isuwang.soa.task.domain.*;
import com.isuwang.task.domain.KsPagingBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * 任务管理控制层
 * Created by WahsonLeung on 2017/11/09.
 */
@Controller
@RequestMapping("task/taskadmin")
public class TaskAdminController {

    private final static String INDEX = "task/taskadmin/task_admin_index";
    private final static String BUSINESS_INDEX = "task/taskadmin/task_business_index";
    private final static String SUGGESTION_INDEX = "task/taskadmin/task_suggestion_index";
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskAdminController.class);

    @RequestMapping("/index")
    public String index() {
        return INDEX;
    }

    @RequestMapping("/business_index")
    public String businessIndex() {
        return BUSINESS_INDEX;
    }

    @RequestMapping("/suggestion_index")
    public String suggestionIndex() {
        return SUGGESTION_INDEX;
    }


    @RequestMapping(value = "/findTasks", method = RequestMethod.GET)
    @ResponseBody
    public TTaskResponse findTasks(KsPagingBean<TTaskRequest, TTaskResponse> pagingBean, TTaskRequest request) throws SoaException {
        request.pageRequest = new TPageRequest()
                .start(pagingBean.getStart())
                .limit(pagingBean.getLimit())
                .sortFields(Optional.ofNullable(pagingBean.getSortFields()));

        return new TaskAdminServiceClient().findTasks(request);
    }

    /**
     * 解绑
     *
     * @param taskId
     * @throws SoaException
     */
    @RequestMapping(value = "/findTaskDetailById", method = RequestMethod.POST)
    @ResponseBody
    public TTaskDetail findTaskDetailById(@RequestParam(value = "taskId") int taskId) throws SoaException {
        return new TaskAdminServiceClient().findTaskDetailById(taskId);
    }

    /**
     * 新建任务
     *
     * @param request
     * @throws SoaException
     */
    @RequestMapping(value = "/createTask", method = RequestMethod.POST)
    @ResponseBody
    public void createTask(@RequestBody TCreateTaskRequest request) throws SoaException {
        new TaskAdminServiceClient().createTask(request);
    }

    /**
     * 编辑/更新 任务
     *
     * @param request
     * @throws SoaException
     */
    @RequestMapping(value = "/updateTask", method = RequestMethod.POST)
    @ResponseBody
    public void updateTask(@RequestBody TUpdateTaskRequest request) throws SoaException {
        new TaskAdminServiceClient().updateTask(request);
    }

    /**
     * 解绑
     *
     * @param subTaskId
     * @throws SoaException
     */
    @RequestMapping(value = "/unbindSubTask", method = RequestMethod.POST)
    @ResponseBody
    public void unbindSubTask(@RequestParam(value = "id") int subTaskId) throws SoaException {
        new TaskAdminServiceClient().unbindSubTask(subTaskId);
    }

    /**
     * 新增备注
     *
     * @param taskRemark
     * @throws SoaException
     */
    @RequestMapping(value = "/createTaskRemark", method = RequestMethod.POST)
    @ResponseBody
    public void createTaskRemark(TSaveTaskRemark taskRemark) throws SoaException {
        new TaskAdminServiceClient().createTaskRemark(taskRemark);
    }

    /**
     * 、
     * 修改/编辑备注
     *
     * @param taskRemark
     * @throws SoaException
     */
    @RequestMapping(value = "/updateTaskRemark", method = RequestMethod.POST)
    @ResponseBody
    public void updateTaskRemark(TSaveTaskRemark taskRemark) throws SoaException {
        new TaskAdminServiceClient().updateTaskRemark(taskRemark);
    }

    /**
     * 删除备注
     *
     * @param id
     * @throws SoaException
     */
    @RequestMapping(value = "/deleteTaskRemark", method = RequestMethod.POST)
    @ResponseBody
    public void deleteTaskRemark(int id) throws SoaException {
        new TaskAdminServiceClient().deleteTaskRemark(id);
    }

    /**
     * 新增日志
     *
     * @param taskLog
     * @throws SoaException
     */
    @RequestMapping(value = "/createTaskLog", method = RequestMethod.POST)
    @ResponseBody
    public void createTaskLog(TCreateTaskLog taskLog) throws SoaException {
        new TaskAdminServiceClient().createTaskLog(taskLog);
    }

    /**
     * 删除附件
     *
     * @param id
     * @throws SoaException
     */
    @RequestMapping(value = "/deleteTaskAttachment", method = RequestMethod.POST)
    @ResponseBody
    public void deleteTaskAttachment(int id) throws SoaException {
        new TaskAdminServiceClient().deleteTaskAttachment(id);
    }

    /**
     * 上传附件
     *
     * @param multipartRequest
     * @param taskId
     * @throws SoaException
     * @throws IOException
     */
    @RequestMapping(value = "/createTaskAttachment", method = RequestMethod.POST)
    @ResponseBody
    public List<TTaskAttachment> createTaskAttachment(MultipartHttpServletRequest multipartRequest, int taskId) throws SoaException, IOException {
        List<TTaskAttachment> result = new ArrayList<>();
//        for (Iterator it = multipartRequest.getFileNames(); it.hasNext(); ) {
//            TTaskAttachment attachment  =new TTaskAttachment();
//            String key = (String) it.next();
//            byte[] binData;
//            MultipartFile imgFile = multipartRequest.getFile(key);
//
//            String attachmentId = uploadAttachment(imgFile.getBytes(), imgFile.getContentType());
//            TCreateTaskAttachment taskAttachment = new TCreateTaskAttachment();
//            taskAttachment.setTaskId(taskId);
//            taskAttachment.setAttachmentId(attachmentId);
//            taskAttachment.setAttachmentName(imgFile.getOriginalFilename());
//
//            int id = new TaskAdminServiceClient().createTaskAttachment(taskAttachment);
//
//            attachment.setId(id);
//            attachment.setAttachmentName(imgFile.getOriginalFilename());
//            attachment.setAttachmentId(attachmentId);
//            attachment.setUpdatedAt(System.currentTimeMillis());
//            result.add(attachment);
//        }
        return result;
    }

    /**
     * 上传附件，返回sha1处理后的文件名
     *
     * @return
     */
    private String uploadAttachment(byte[] binData, String fileType) throws SoaException {
        return "";
    }


    /**
     * 删除任务
     *
     * @param id
     */
    @RequestMapping(value = "/deleteTask", method = RequestMethod.POST)
    @ResponseBody
    public void deleteTask(int id) {
        System.out.println(id);
    }

    @RequestMapping(value = "/findBusinessTypes", method = RequestMethod.GET)
    @ResponseBody
    public TBusinessTypeResponse findBusinessTypes(KsPagingBean<TBusinessTypeRequest, TBusinessTypeResponse> pagingBean, TBusinessTypeRequest request) throws SoaException {
        request.pageRequest = new TPageRequest()
                .start(pagingBean.getStart())
                .limit(pagingBean.getLimit())
                .sortFields(Optional.ofNullable(pagingBean.getSortFields()));
        return new TaskBusinessTypeServiceClient().findBusinessTypes(request);
    }

    /**
     * 新增业务类型
     *
     * @param request
     * @throws SoaException
     */
    @RequestMapping(value = "/createBusinessType", method = RequestMethod.POST)
    @ResponseBody
    public void createBusinessType(@RequestBody TSaveBusinessType request) throws SoaException {
        new TaskBusinessTypeServiceClient().createBusinessType(request);
    }

    /**
     * 编辑/更新 业务类型
     *
     * @param request
     * @throws SoaException
     */
    @RequestMapping(value = "/updateBusinessType", method = RequestMethod.POST)
    @ResponseBody
    public void updateBusinessType(@RequestBody TSaveBusinessType request) throws SoaException {
        new TaskBusinessTypeServiceClient().updateBusinessType(request);
    }

    /**
     * 删除业务类型
     *
     * @param id
     * @throws SoaException
     */
    @RequestMapping(value = "/deleteBusinessType", method = RequestMethod.POST)
    @ResponseBody
    public void deleteBusinessType(int id) throws SoaException {
        new TaskBusinessTypeServiceClient().deleteBusinessType(id);
    }


    /**
     * 查询意见标准
     *
     * @param request
     * @throws SoaException
     */
    @RequestMapping(value = "/findSuggestions", method = RequestMethod.GET)
    @ResponseBody
    public TSuggestionResponse findSuggestions(KsPagingBean<TSuggestionRequest, TSuggestionResponse> pagingBean,TSuggestionRequest request) throws SoaException {
        request.pageRequest = new TPageRequest()
                .start(pagingBean.getStart())
                .limit(pagingBean.getLimit())
                .sortFields(Optional.ofNullable(pagingBean.getSortFields()));

        request.labels(request.getLabels().map(labels -> {
            try {
                return new String(labels.getBytes("iso-8859-1"), "utf-8");
            } catch (UnsupportedEncodingException e) {
                LOGGER.error(e.getMessage());
                return labels;
            }
        }));
        return new TaskSuggestionServiceClient().findSuggestions(request);
    }

    /**
     * 新增意见标准
     *
     * @param request
     * @throws SoaException
     */
    @RequestMapping(value = "/createSuggestion", method = RequestMethod.POST)
    @ResponseBody
    public void saveSuggestion(@RequestBody TSaveSuggestion request) throws SoaException {
        new TaskSuggestionServiceClient().createSuggestion(request);
    }

    /**
     * 编辑/更新意见标准
     *
     * @param request
     * @throws SoaException
     */
    @RequestMapping(value = "/updateSuggestion", method = RequestMethod.POST)
    @ResponseBody
    public void updateSuggestion(@RequestBody TSaveSuggestion request) throws SoaException {
        new TaskSuggestionServiceClient().updateSuggestion(request);
    }

    /**
     * 删除意见标准
     *
     * @param id
     * @throws SoaException
     */
    @RequestMapping(value = "/deleteSuggestion", method = RequestMethod.POST)
    @ResponseBody
    public void deleteSuggestion(int id) throws SoaException {
        new TaskSuggestionServiceClient().deleteSuggestion(id);
    }


    @RequestMapping(value = "/findAllTaskNos4Picker", method = RequestMethod.GET)
    @ResponseBody
    public List<TTaskPickerContainer> findAllTaskNos4Picker() throws SoaException {
        return new TaskAdminServiceClient().findAllTaskNos4Picker();
    }


    @RequestMapping(value = "/findAllBusinessTypes4Picker", method = RequestMethod.GET)
    @ResponseBody
    public List<TTaskPickerContainer> findAllBusinessTypes4Picker() throws SoaException {
        return new TaskBusinessTypeServiceClient().findAllBusinessTypes4Picker();
    }

    @RequestMapping(value = "/findAllSuggestions4PickerByType", method = RequestMethod.GET)
    @ResponseBody
    public List<TSuggestion4Picker> findAllSuggestions4PickerByType(int type) throws SoaException {
        return new TaskSuggestionServiceClient().findAllSuggestions4PickerByType(type);
    }

}
