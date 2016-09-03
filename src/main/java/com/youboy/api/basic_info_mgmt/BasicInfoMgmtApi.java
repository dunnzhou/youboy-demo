package com.youboy.api.basic_info_mgmt;

import com.youboy.model.basic_info.BasicInfo;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dunn.zhou on
 * 16/9/3.
 */
@Api(value = "basic_info_mgmt_api", description = "基础信息")
@RequestMapping("/basic/info")
public interface BasicInfoMgmtApi {



    @ApiOperation(
            value = "",
            notes = "基础信息查询",
            responseReference = "" +
                    "{" +
                    "address:\"广州市广州县广州村广州屯\"" +
                    "name:\"妖妖灵\"" +
                    "tel:\"110\"" +
                    "userId:0"+
                    "}",
            httpMethod = "GET",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponse(
            code = 200,
            message = "Success",
            response = BasicInfo.class
    )
    ResponseEntity<BasicInfo> basicInfoGet(
            @ApiParam(
                    name = "userId",
                    defaultValue = "1",
                    required = true,
                    value = "用户id"
            )
            @RequestParam("userId")
            String userId
    );

    @ApiOperation(
            value = "",
            notes = "基础信息添加",
            response = BasicInfo.class
    )
    ResponseEntity<BasicInfo> basicInfoAdd(
            @ApiParam(value = "",name ="基础信息json对象" ,required = true)
            @RequestBody BasicInfo basicInfo

    );

    @ApiOperation(
            value = "",
            notes = "基础信息删除",
            response = BasicInfo.class
    )
    ResponseEntity<Boolean> basicInfoDelete(
            @ApiParam(value = "",name = "用户id",required = true)
            @RequestBody String userId
    );


    @ApiOperation(
            value = "",
            notes = "基础信息修改",
            response = BasicInfo.class
    )
    ResponseEntity<BasicInfo> basicInfoUpdate(
            @ApiParam(value = "",name ="基础信息json对象" ,required = true)
            @RequestBody BasicInfo basicInfo

    );
}
