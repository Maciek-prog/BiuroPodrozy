function check(){
    let admin = 'admin';
    let passAdmin = 'admin';
    let root = 'root';
    let passroot='root';

    if((admin ='admin')&&(passAdmin='admin')){
        window.location.href= "admin.html";
    } else if((root ='root')&&(passroot='root')){
        window.location.href= "/index.html";
    }
}



// let  userAdmin = "admin";
// let passAdmin = "admin";
// let user = "root";
// let passUser = "root";
//
//
// function sprawdz_haslo(){
//
// }
//
//
// function checkk()
//  {
//      let userA = document.userAdmin.user.value;
//      let passA = document.passAdmin.value;
//
//      if(!sprawdz_haslo(userAdmin, passAdmin)){
//          alert('Niepoprawne hasło!');
//      }
//      else{
//          document.location.href = "/index.html";
//      }
//      let userU = document.user.user.value;
//      let passU = document.passUser.value;
//         if(!sprawdz_haslo(userU,passU)){
//             alert('Niepoprawne hasło!');
//
//         }else{
//             document.location.href = "/index.html";
//         }
//  }