function showSection(sectionId) {
    // 모든 섹션 숨기기
    var sections = document.getElementsByClassName('section');
    for (var i = 0; i < sections.length; i++) {
        sections[i].style.display = 'none';
    }

    // 선택된 섹션 보이기
    var selectedSection = document.getElementById(sectionId);
    if (selectedSection) {
        selectedSection.style.display = 'block';
    }
}

// 페이지 로드 시 기본 섹션 보이기
window.onload = function () {
    const header = document.getElementsByTagName("header")[0];
    header.style.position = "unset";

    showSection('profile');
}
/* 번호 변경 클릭시 */
function enablePhoneInput() {
    document.getElementById("phone").disabled = true;
    document.getElementById("phoneInputSection").style.display = "block";
}
/* 비즈니스 유형 클릭시 */
function enableBusinessField() {
    var businessFieldCheckboxes = document.getElementsByName("businessField");
    for (var i = 0; i < businessFieldCheckboxes.length; i++) {
        businessFieldCheckboxes[i].disabled = false;
    }
}


document.addEventListener("DOMContentLoaded", function () {
    const passwordInput = document.getElementById("password");
    const deleteButton = document.getElementById("deleteButton");

    // 비밀번호 입력 시 버튼 활성화
    passwordInput.addEventListener("input", function () {
        const password = passwordInput.value.trim();

        // 비밀번호 입력 확인
        if (password.length > 0) {
            deleteButton.removeAttribute("disabled");
        } else {
            deleteButton.setAttribute("disabled", "disabled");
        }
    });
});