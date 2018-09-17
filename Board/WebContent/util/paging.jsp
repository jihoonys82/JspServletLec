<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- pagination --%>
<div>
	<nav aria-label="Page navigation">
	  <ul class="pagination">
	  	<!-- 이전페이지 -->
	  	<!-- 첫페이지라면 금지 표시 -->
	  	<c:if test="${paging.curPage eq 1 }">
	  		<li class="page-item disabled">
		      <a class="page-link" href="/board/pagingList.do" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		        <span class="sr-only">Previous</span>
		      </a>
		    </li>
	  	</c:if>
	  	<c:if test="${paging.curPage ne 1 }">
		  	<li class="page-item">
		      <a class="page-link" href="/board/pagingList.do?curPage=${paging.curPage-1 }&search=${paging.search }" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
	  	</c:if>
	    <c:forEach var="page" begin="${paging.startPage }" end="${paging.endPage }">
	    	<c:if test="${paging.curPage eq page }">	    	
	    		<li class="page-item active">
	    	</c:if>
	    	<c:if test="${paging.curPage ne page }">
	    		<li class="page-item">
	    	</c:if>
	    		<a class="page-link" href="/board/pagingList.do?curPage=${page }&search=${paging.search }">${page }</a>
    		</li>
	    </c:forEach>
	    <!-- 다음 페이지 -->
	    <c:if test="${paging.totalPage eq curPage }">
		    <li class="page-item disabled">
		      <a class="page-link" href="/board/pagingList.do" aria-label="Next" >
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>	
	    </c:if>
	    <c:if test="${paging.totalPage ne curPage }">
		    <li class="page-item">
		      <a class="page-link" href="/board/pagingList.do?curPage=${paging.curPage+1 }&search=${paging.search }" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
	    
	    </c:if>
	    
	    
	  </ul>
	</nav>
</div>