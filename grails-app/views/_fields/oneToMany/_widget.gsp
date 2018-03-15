<g:set var="association" value="${persistentProperty.associatedEntity}"/>
<g:set var="associatedController" value="${association.decapitalizedName}"/>
<ul class="list-group">
    <g:each in="${value}" var="item">
        <li class="list-group-item"><g:link controller="${associatedController}" id="${item.id}">${item}</g:link></li>
    </g:each>
</ul>

<div class="text-right">
    <g:link controller="${associatedController}"
            action="create" params="[(beanClass.decapitalizedName + '.id'): bean.id]"
            class="btn btn-info">
        <g:message code="default.add.label"
                   args="[message(code: associatedController + '.label',
                           default: association.javaClass.simpleName)]"/>
    </g:link>
</div>
