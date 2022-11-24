<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>naver.html</title>
    <style>
        .wrap{
            margin-left: auto;
            width: 600px;
            border: 1px dashed pink;
        }
        .title{
            font-size: 55px;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        span{
            
            padding: 25px;
            
        }
        input{
            margin: 10px;
            padding: 30px;
            width: 400px;
        }
        .YMD{
            height: 5px;
            width: 25px;
        }
        .ID{
            
        }
        h3{
            padding-left: 35px;
        }
    </style>
</head>
<body>
<form action="quiz-result.jsp">

    <div class="wrap">

        <div>
            <div class="title"><a href="">NAVER</a></div>       
        </div>
        <div>
            <div>
                <h3>아이디</h3>
                <span><input type="text" name="id"></span>
            </div>
            <div>
                <h3>비밀번호</h3>
                <span><input type="text" name="pw"></span>
                <h3>비밀번호 재확인</h3>
                <span><input type="text" name="pw" ></span>
            </div>
            <div>
    
                <div>
                    <h3>이름</h3>
                    <span><input type="text" name="name"></span>
                </div>
                <div>
                    <h3>생년월일</h3>
                    <span><input class="YMD"type="text" name="y" placeholder="년(4자)"></span>
                    <span><input class="YMD"type="text" name="m" placeholder="월"></span>
                    <span><input class="YMD"type="text" name="d" placeholder="일"></span>
                </div>
                <div>
                    <h3>성별</h3>
                    <span><input type="text" name="sex"></span>
                </div>
                <div>
                    <h3>본인 이메일</h3>
                    <span><input type="text" name="email" placeholder="선택입력"></span>
                </div>
                <div>
                    <h3>휴대전화</h3>
                    <span><input type="text" name="phoneNo"></span>
                </div>
                <span><input type="submit"></span>
            </div>
        </div>
    </div>
</form>
</body>
</html>