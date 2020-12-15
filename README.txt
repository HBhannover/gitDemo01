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
		[Working-Directory] -----git add-----> [Staging area] ----git commit------> [Git-Directory]
		    |       |	|			    |     |			             |  | |	
		    |  	    |	|<--git reset HEAD <file> --|     |<--git reset --soft <Commit-ID> --|	| |	  		 									         	|   |
   git checkout <---|       <------------------------- git reset --mixed <Commit-ID> -------------------| | 	
	            	                                                                                  |
	      <------------------------------------------------ git reset --hard <Commit-ID> --------------




3. Cac lenh trong Git:
	3.1 git init --> git status --> git add --> git commit -m ""
	3.2 git log: xem lich su commit cung voi id cua commit do
	    git log --oneline --graph: Xem theo dong	
	3.3 git show + id: xem cu the cai gi da duoc thay doi trong commit nay, neu khong +id thi no se xem thay doi cua commit gan nhat.
	3.4 git diff: xem noi dung cac file cu da bi thay doi ke tu lan commit gan nhat ==> thoat ra ngoai bang phim: "q"
	3.5 gitk ==> Mo giao dien GUI
	3.6 git checkout --<file> : Xoa thay doi tai <file>
	3.7 File .gitignore
	3.8 git revert <Commit-id>
	3.9 De config 5 tieng phai nhap pass mot lan thi dung cau lenh.
		git config global credential.helper "cache --timeout=18000"
	3.10. Re nhanh va chuyen sang nhanh do:
		git branch -b <Ten cua Branch>
	3.11. Chuyen sang mot Branch da co san.
		git branch <Ten Branch da co san>
	3.12. Merge Branch B vao Branch A
		git checkout A --> git merge B
	3.13. Xoa mot Branch:
		git branch -D <Ten Branch muon xoa>
	3.14. Vai lenh GIT quan trong nua:
	       - Xem lich su cac Commit, ke ca nhung Commit bi xoa, bi convert, bi rebase, etc..
	       	 git reflog
	       - Xem Cofig cua GIT cho du an hien tai:
	       	 git config --list
	       - Tu Commit hien tai ta muon lay them cac thay doi o nhung Commit khac bat ky cho vao Commit hien tai (Sau do phai xu ly Conflicts)
	       	 git cherry-pick <Commit-ID>
	       - Dang o Commit hien tai, muon nhay sang mit Commit khac:
	         git checkout <Commit-ID>
	       - Xem lich su Commit theo dong:
	         git log --oneline --graph

4. Git va GitHub
	4.1. Tao Repo tren GitHub
	4.2. Tao ket noi giua Local-Repo va Remote-Repo: git remote add origin <GitHub-Repo-Link>
	4.3. Push code len tren GitHub:
		4.3.1: Lan dau tien: git push -u origin master
		4.3.2: Lan tiep theo: git push
		4.3.3: push mot Local-Branch len Remote-Branch (khong phai Master), neu lan dau tien thi nen co them -u giong nhu 4.3.1
			git push origin <Local-Branch>:<Remote-Branch>
		4.3.4: Clone Project ve may: 
			git clone <GitHub-Repo-Link>
		4.3.5: Clone mot RemoteBranch ve Local-Repo:
		       1. Tao mot Local-Folder de chua RemoteBranch.
		       2. Tu GitBash/CMD cua Local-Folder thu hien lenh:
		       git clone <Link-Remote-Repo.git> -b <Remote-Branch> <./Local-Branch>
		       
	4.4 Cap nhat code moi tu GitHub ve may:
		git pull origin <Branch>
	4.5 Cap nhat code moi tu GitHub ve may lan dau tien, ma tren GitHub da co san cac thay doi tu truoc roi:
		git pull origin <Branch> --allow-unrelated-histories

	

