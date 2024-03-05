<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>지각 체크 프로그램</title>
</head>
<body>
    <h1>지각 체크 프로그램</h1>

    <%
        // 학생 명단 (학번: 이름)
        Map<String, String> students = new HashMap<>();
        students.put("20210001", "홍길동");
        students.put("20210002", "김철수");
        students.put("20210003", "이영희");

        // 지각 여부 초기화
        Map<String, Boolean> attendance = new HashMap<>();
        for (String studentId : students.keySet()) {
            attendance.put(studentId, false);
        }

        // 지각 처리
        String studentId = request.getParameter("studentId");
        if (studentId != null && students.containsKey(studentId)) {
            attendance.put(studentId, true);
            out.println("<p>" + students.get(studentId) + "님은 지각 처리되었습니다.</p>");
        } else if (studentId != null) {
            out.println("<p>학번 " + studentId + "에 해당하는 학생이 명단에 없습니다.</p>");
        }

        // 지각한 학생 목록 출력
        out.println("<h2>지각한 학생 목록</h2>");
        for (String id : attendance.keySet()) {
            if (attendance.get(id)) {
                out.println("<p>" + students.get(id) + " (" + id + ")</p>");
            }
        }
    %>

    <form method="post">
        <label for="studentId">학번:</label>
        <input type="text" id="studentId" name="studentId">
        <input type="submit" value="지각 처리">
    </form>
</body>
</html>