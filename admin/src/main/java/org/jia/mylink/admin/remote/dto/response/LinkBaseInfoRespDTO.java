package org.jia.mylink.admin.remote.dto.response;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 短链接基础信息响应对象
 * @author JIA
 * @version 1.0
 * @since 2024/3/23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LinkBaseInfoRespDTO {
    /**
     * 描述信息
     */
    @ExcelProperty("标题")
    @ColumnWidth(40)
    private String describe;

    /**
     * 短链接
     */
    @ExcelProperty("短链接")
    @ColumnWidth(40)
    private String fullShortUrl;

    /**
     * 原始链接
     */
    @ExcelProperty("原始链接")
    @ColumnWidth(80)
    private String originUrl;
}
