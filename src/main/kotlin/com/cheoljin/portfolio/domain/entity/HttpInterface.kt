package com.cheoljin.portfolio.domain.entity

import jakarta.persistence.*
import jakarta.servlet.http.HttpServletRequest

@Entity
class HttpInterface(httpServletRequest: HttpServletRequest) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    var id: Long? = null // ?는 null 허용

    var cookies: String? =
        httpServletRequest.cookies
            ?.map { "${it.name}:${it.value}" }
            ?.toString()
    // ?붙인이유 널이면 실행안해서 널포인터 예외 발생x

    var referer: String? = httpServletRequest.getHeader("referer")

    //클라이언트 ip 관련
    var localAddr: String? = httpServletRequest.localAddr
    var remoteAddr: String? = httpServletRequest.remoteAddr
    var remoteHost: String? = httpServletRequest.remoteHost

    // 어떤 uri로 접속했는지  /main   /project 정보 들어감
    var requestUri: String? = httpServletRequest.requestURI

    // 브라우저 정보  크롬, 익스, 모바일/pc
    var userAgent: String? = httpServletRequest.getHeader("user-agent")


}