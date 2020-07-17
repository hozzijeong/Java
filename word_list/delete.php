<?php 
    $word_idx = $_POST['idx'];
    $user_idx = $_POST['user_idx'];
    
    $link = mysql_conncet("localhost", "hozzi", "adgjm9654");
    mysql_query("SET NAMES utf8");
    
    mysql_select_db("hozzi",$link) or die("you choose wrong one");
    
    mysql_query("DELETE from whole_word_list where idx = '$word_data'",$link);
    
    
    // 데이터 삭제 후, 바뀐 내용을 다시 업로드 해 줘야함? 
    $qry_result =  mysql_query("select * from whole_word_list
            where user_idx = '$user_idx'",$link);
    
    $memberDatas = array(); //변수를 배열로 선언
    
    while($qry_row = mysql_fetch_array($qry_result))
    {
        $member = array("eng" => $qry_row["eng"] , "kor" => $qry_row["kor"],
            "idx" => $qry_row["idx"]
        );
        
        array_push($memberDatas, $member);
    }
    
    $result = array("result" => OK, "list"=>$memberDatas);
    
    echo json_encode($result);
    
    mysql_close($link);


?>