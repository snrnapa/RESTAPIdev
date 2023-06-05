readme.md


curl -X GET "http://localhost:8080/diary" | python -m json.tool

curl -X POST -H "Content-Type:application/json" -d "[{\"id\":0, \"comment\":\"うへえええええてすと\", \"createDatetime\": \"2023-06-03T22:10:38\"}]" http://localhost:8080/diary　| python -m json.tool

***

## 参考にしたサイト

https://it-jog.com/java/springdatajpa/h2console

https://qiita.com/L_A_P_119611/items/e44367ab6336f2fd09ea

## モット読みたいサイト

- クールなURIについて
	-	https://qiita.com/s79ns/items/e2f3b6f66059c2917206

- @RestControllerと@Controllerの違いについて
	-	https://anveloper.com/2021/01/25/controller%E3%80%81%EF%BC%A0restcontroller%E9%81%95%E3%81%84/

## URL集

http://localhost:8080/h2-console/

http://localhost:8080/

