package com.youboy.api.basic_info_mgmt;

import com.youboy.model.basic_info.BasicInfo;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ResponseHeader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dunn.zhou on
 * 16/9/3.
 */
@Controller
public class BaseInfoMgmtController implements BasicInfoMgmtApi {

    @RequestMapping(
            value = "/get",
            method = RequestMethod.GET
    )
    @Override
    public ResponseEntity<BasicInfo> basicInfoGet(@RequestParam("userId")String userId) {
        BasicInfo basicInfo = new BasicInfo();
        basicInfo.setUserId(userId);
        basicInfo.setAddress("广州市广州县广州村广州屯");
        basicInfo.setName("妖妖灵");
        basicInfo.setTel("110");
        return ResponseEntity.ok(basicInfo);
    }

    @RequestMapping(
            value = "/add",
            method = RequestMethod.POST
    )
    @Override
    public ResponseEntity<BasicInfo> basicInfoAdd(@ApiParam(value = "", name = "基础信息json对象",
            required = true) @RequestBody BasicInfo basicInfo) {
        return ResponseEntity.ok(basicInfo);
    }

    @RequestMapping(
            value = "/delete",
            method = RequestMethod.DELETE
    )
    @Override
    public ResponseEntity<Boolean> basicInfoDelete(@ApiParam(value = "", name = "用户id",
            required = true) @RequestBody String userId) {
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @RequestMapping(
            value = "/update",
            method = RequestMethod.POST
    )
    @Override
    public ResponseEntity<BasicInfo> basicInfoUpdate(@ApiParam(value = "", name = "基础信息json对象", required = true) @RequestBody BasicInfo basicInfo) {
        return ResponseEntity.ok(basicInfo);
    }
}
