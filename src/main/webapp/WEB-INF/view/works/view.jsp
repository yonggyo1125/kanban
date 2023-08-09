<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<c:url var="listUrl" value="/works" />
<c:url var="editUrl" value="/works/edit/${work.workNo}" />
<c:url var="addUrl" value="/works/add" />
<c:url var="deleteUrl" value="/works/delete/${work.workNo}" />

<layout:main title="작업 보기">

<section class="work_view">
    <div class="subject">
        <span class="status">${work.status.status}</span>
        ${work.subject}
    </div>
    <div class="content">
        ${work.content}
    </div>
    <div class="links">

    </div>
</section>


</layout:main>