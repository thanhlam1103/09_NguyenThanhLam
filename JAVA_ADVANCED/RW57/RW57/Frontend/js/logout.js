function logout() {
    storage.removeItem("ID");
    window.location.href = "login.html";

}