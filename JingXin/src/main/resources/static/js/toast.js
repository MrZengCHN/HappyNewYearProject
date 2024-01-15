function toast(type, msg) {
    const modal = document.createElement('div');
    modal.classList.add('toast')
    modal.style.position = 'fixed';
    modal.style.right = '20px';
    modal.style.top = '20px';
    modal.style.width = '200px';
    const container = document.createElement('div');
    container.classList.add('ui', 'center', 'aligned', 'container');

    const segment = document.createElement('div');
    segment.classList.add('ui','message');

    const header = document.createElement('h3');
    header.classList.add('ui', 'header');

    const icon = document.createElement('i');
    if (type==='success'){
        icon.classList.add('ui', 'teal', 'check', 'circle', 'outline', 'icon');
    }else if(type==='error'){
        icon.classList.add('ui', 'red', 'close', 'icon', 'icon');
    }else {
        icon.classList.add('ui', 'yellow', 'bug', 'icon');
    }

    header.appendChild(icon);
    header.appendChild(document.createTextNode(msg));
    segment.appendChild(header);
    container.appendChild(segment);
    modal.appendChild(container);

    document.body.appendChild(modal);
    $('.toast').show()// 使用Semantic UI的modal组件显示模态框
    setTimeout(()=>{
        $('.toast').remove()
    },2000)

}

