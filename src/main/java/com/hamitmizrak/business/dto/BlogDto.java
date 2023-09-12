package com.hamitmizrak.business.dto;

import com.hamitmizrak.auditing.AuditingAwareBaseDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import java.io.Serializable;

// LOMBOK
@Data
@NoArgsConstructor //parametresiz con.
@AllArgsConstructor //parametreli
@Builder
@Log4j2
public class BlogDto extends AuditingAwareBaseDto implements Serializable {

    // Serileştirme
    public static final Long serialVersionUID=1L;
//serileştirme bir veri başka bir yere taşırken bir sorun olmaması için yapılan işlem(
// 1L dediğimizde bunu java kendi yapsın demek


    // HEADER
    @NotEmpty(message = "{blog.header.va lidation.constraints.NotNull.message}")
    //eğer kullanıcı bir veri girmeyi unutursa alıcamız hata mesajı
    @Size(min=10,message = "{blog.header.least.validation.constraints.NotNull.message}")
    //kullanıcı 10 karakterden az veri girerse bu hata mesajını alıcak
    private String header;
    //Ama programlama yaparken hata mesajını buraya yazmka yerine valideyın kısmında yazıp buraya o sayfanın bağlantısı eklenmeli


    // CONTENT
    @NotEmpty(message = "{blog.content.validation.constraints.NotNull.message}")
    @Size(min=10,message = "{blog.content.least.validation.constraints.NotNull.message}")
    private String content;
}