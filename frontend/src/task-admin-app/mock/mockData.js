import {metadata} from "./metadata.js";
import {taskdata} from "./taskdata.js";
import {suggestionsData} from "./suggestionsData.js";
import {businessData} from "./businessData.js";
import {tasks} from "./tasks.js";
import {businessTypes} from "./businessTypes.js";
import {todayTotoTasks, timeoutTodoTasks, complaints, dealingComplaints, allTasks} from "./task.js";
import {questions, measures} from "./moreSuggestions.js";
// test
// init first mock
MockDataPool.when("POST", "/dapeng/metadata")
  .withExpectedHeader("content-type", "application/x-www-form-urlencoded;charset=UTF-8")
  .responseWith({status: 200, body: JSON.stringify(metadata)});

MockDataPool.when("GET", "/task/taskadmin/findTasks.do?limit=15")
// .withExpectedHeader("content-type", "text/plain;charset=utf-8")
  .responseWith({status: 200, body: JSON.stringify(taskdata)});

MockDataPool.when("GET", "/task/taskadmin/findSuggestions.do?limit=15")
    .responseWith({status: 200, body: JSON.stringify(suggestionsData)});

MockDataPool.when("GET", "/task/taskadmin/findBusinessTypes.do?limit=15")
    .responseWith({status: 200, body: JSON.stringify(businessData)});

MockDataPool.when("GET", "/task/taskadmin/findAllTaskNos4Picker.do")
    .responseWith({status: 200, body: JSON.stringify(tasks)});

MockDataPool.when("GET", "/task/taskadmin/findAllBusinessTypes4Picker.do")
    .responseWith({status: 200, body: JSON.stringify(businessTypes)});

/*今日待办事项*/
MockDataPool.when("GET", "/task/taskadmin/findTasks.do?type=1&status=12&planAtStart=1512662400000&planAtEnd=1512748800000&start=0&limit=15")
    .responseWith({status: 200, body: JSON.stringify(todayTotoTasks)});

/*超时待办事项*/
MockDataPool.when("GET", "/task/taskadmin/findTasks.do?type=1&status=12&planAtEnd=1512662400000&start=0&limit=15")
    .responseWith({status: 200, body: JSON.stringify(timeoutTodoTasks)});

/*未处理投诉*/
MockDataPool.when("GET", "/task/taskadmin/findTasks.do?type=2&status=1&start=0&limit=15")
    .responseWith({status: 200, body: JSON.stringify(complaints)});

/*处理中投诉*/
MockDataPool.when("GET", "/task/taskadmin/findTasks.do?type=2&status=2&start=0&limit=15")
    .responseWith({status: 200, body: JSON.stringify(dealingComplaints)});

/*所有tasks*/
MockDataPool.when("GET", "/task/taskadmin/findTasks.do?start=0&limit=15")
    .responseWith({status: 200, body: JSON.stringify(allTasks)});

/*问题*/
MockDataPool.when("GET", "/task/taskadmin/findAllSuggestions4PickerByType.do?type=1")
    .responseWith({status: 200, body: JSON.stringify(questions)});

/*改进措施*/
MockDataPool.when("GET", "/task/taskadmin/findAllSuggestions4PickerByType.do?type=2")
    .responseWith({status: 200, body: JSON.stringify(measures)});