package net.yeoubi.henesys.domain.usecases;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public abstract class UseCase<Request, Response> {
    protected abstract Response buildUseCase(Request request);

    public <RequestDto, ResponseDto> CompletionStage<ResponseDto> execute(
        RequestDto requestDto,
        RequestConverter<RequestDto, Request> requestConverter,
        ResponseConverter<Response, ResponseDto> responseConverter
    ) {
        return CompletableFuture
            .supplyAsync(() -> requestConverter.convert(requestDto))
            .thenApplyAsync(this::buildUseCase)
            .thenApplyAsync(responseConverter::convert);
    }

    public interface RequestConverter<RequestDto, Request> {
        Request convert(RequestDto request);
    }

    public interface ResponseConverter<Response, ResponseDto> {
        ResponseDto convert(Response response);
    }
}
