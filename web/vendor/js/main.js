$(function () {
    $('form').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            'userEntity.userName': {
                message: '用户名非法',
                validators: {
                    notEmpty: {
                        message: '用户名不能为空\n'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '用户名长度必须位于3到20之间\n'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: '用户名由数字字母下划线和.组成\n'
                    }
                }
            },
            'userEntity.userAccount': {
                message: '账号验证失败',
                validators: {
                    notEmpty: {
                        message: '账号不能为空\n'
                    },
                    stringLength: {
                        min: 6,
                        max: 18,
                        message: '账号长度必须在6到18位之间\n'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户名只能包含大写、小写、数字和下划线\n'
                    }
                }
            },
            'userEntity.userPasswd': {
                message: '密码非法\n',
                validators: {
                    notEmpty: {
                        message: '密码不能为空\n'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '密码长度必须位于3到20之间\n'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: '密码由数字字母下划线和.组成\n'
                    }
                }
            },
            confirmPassword: {
                message: '密码非法\n',
                validators: {
                    notEmpty: {
                        message: '密码不能为空\n'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '密码长度必须位于3到20之间\n'
                    },
                    identical: {
                        field: 'userEntity.userPasswd',
                        message: '两次密码输入不一致\n'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: '密码由数字字母下划线和.组成\n'
                    }
                }
            },
            'userEntity.userMobile': {
                validators: {
                    notEmpty: {
                        message: '手机号码不能为空\n'
                    },
                    stringlength: {
                        min: 11,
                        max: 11,
                        message: '请输入11位手机号码\n'
                    },
                    regexp: {
                        regexp: /^1[3|5|8]{1}[0-9]{9}$/,
                        message: '请输入正确的手机号码\n'
                    }
                }
            }
        }
    });
});