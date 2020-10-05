1. De kiem tra xem mot thu muc da duoc: git init hay chua ta lam nhu sau:

Windows: 
	1.1. Vao thu muc do bang chuot
	1.2. Bo che do an file di
	1.3. Mo cua so CMD.exe
	1.4. cd den thu muc do (Vi du thu muc do ten la: gitProjects)
	1.5. Go lenh: attrib -s -h C:\Users\hbn\Desktop\Bach\ProjekteDemo\gitProjects\.git
==> Trong thu muc do se hien ra file an .git ==> Thu muc nay da duoc git init roi!

Mac/Ubuntu:
	1.1. Go lenh ls -al  ==> File .git se hien ra
	1.2. Ta co the go them lenh: ls .git ==> Ta se nhay vao file .git  ==> Chung to Thu muc nay da duoc git init roi!

2. Git-Konzept:
	2.1. Working-Directory
	2.2. Staging area
	2.3. Git-Directory
		[Working-Directory] ------------git add----------> [Staging area] --------git commit---------> [Git-Directory]
		    |       |	|					|     |					    |   |   |	
		    |  	    |	|<---------git reset HEAD <file> -------|     |<-----git reset --soft <Commit-ID> --|	|   |	  		 									         	|   |
 git checkout <-----|       <----------------------------------- git reset --mixed <Commit-ID> ---------------------------- |	
	            	                                                                                                    |
	      <------------------------------------------------ git reset --hard <Commit-ID> --------------------------------




3. Cac lenh trong Git:
	3.1 git init --> git status --> git add --> git commit -m ""
	3.2 git log: xem lich su commit cung voi id cua commit do
	3.3 git show + id: xem cu the cai gi da duoc thay doi trong commit nay, neu khong +id thi no se xem thay doi cua commit gan nhat.
	3.4 git diff: xem noi dung cac file cu da bi thay doi ke tu lan commit gan nhat ==> thoat ra ngoai bang phim: "q"
	3.5 gitk ==> Mo giao dien GUI
	3.6 git checkout --<file> : Xoa thay doi tai <file>
	3.7 File .gitignore
	3.8 git revert <Commit-id>
	3.9 De config 5 tieng phai nhap pass mot lan thi dung cau lenh.
		git config global credential.helper "cache --timeout=18000"

4. Git va GitHub
	4.1. Tao Repo tren GitHub
	4.2. Tao ket noi giua Local-Repo va Remote-Repo: git remote add origin <GitHub-Repo-Link>
	4.3. Push code len tren GitHub:
		4.3.1: Lan dau tien: git push -u origin master
		4.3.2: Lan tiep theo: git push
	4.4. Clone Project ve may: 
		git clone <GitHub-Repo-Link>
	4.5 Cap nhat code moi tu GitHub ve may:
		git pull 
	

