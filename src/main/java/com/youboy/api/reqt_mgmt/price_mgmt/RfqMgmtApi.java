package com.youboy.api.reqt_mgmt.price_mgmt;

import com.youboy.model.PageData;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by neron.liu on 9/2/16.
 */
@Api(value = "rfq_mgmt_api", description = "询价管理API")
@RequestMapping("/reqt_mgmt")
public interface RfqMgmtApi {

    @ApiOperation(value = "", notes = "获取询价列表API", response = PageData.class, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = PageData.class)})
    @RequestMapping(value = "/rfq_mgmt",
            consumes = {"application/json"},
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<PageData> rfgMgmtGet(
            @ApiParam(value = "分页的页号", defaultValue = "1", required = true)
            @RequestParam(value = "page", required = false) Integer page,
            @ApiParam(value = "分页的大小", defaultValue = "20", required = true)
            @RequestParam(value = "page_size", required = false) Integer pageSize

    );

}
