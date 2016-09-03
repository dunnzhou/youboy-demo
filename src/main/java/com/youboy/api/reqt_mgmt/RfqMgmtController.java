package com.youboy.api.reqt_mgmt;

import com.youboy.model.PageData;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by neron.liu on 9/2/16.
 */
@Controller
public class RfqMgmtController implements RfqMgmtApi {

    @Override
    public ResponseEntity<PageData> rfgMgmtGet(@ApiParam(value = "分页的页号", defaultValue = "1", required = true) @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "分页的大小", defaultValue = "20", required = true) @RequestParam(value = "page_size", required = false) Integer pageSize) {
        PageData data = new PageData();
        data.setPage(page);
        data.setPageSize(pageSize);
        data.setTotal(pageSize);
        return ResponseEntity.ok(data);
    }
}
